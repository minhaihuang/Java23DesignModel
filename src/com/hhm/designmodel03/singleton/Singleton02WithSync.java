package com.hhm.designmodel03.singleton;

/**
 * 单例模式，增加线程保护。
 * 
 * @author huanghaimin
 *
 */
public class Singleton02WithSync {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton02WithSync instance = null;

	// 构造器私有化
	private Singleton02WithSync() {
	}

	/**
	 * 获取实例
	 *  为什么不在方法上面加synchronized？synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁。
	 *  事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，只在方法内部加上synchronized。
	 *  
	 *  这种方式还是会有问题的：
在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：

a>A、B线程同时进入了第一个if判断

b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();

c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。

d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。

e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。

所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。在Singleton03Improve01和Singleton03Improve02我们对程序做进一步优化：

	 * @return
	 */
	public static Singleton02WithSync getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton02WithSync();
				}
			}
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
		return instance;  
	}  
}
