package com.hhm.designmodel03.singleton;
/**
 * 单例模式，貌似完美版01.
 * 其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
 * @author huanghaimin
 *
 */
public class Singleton03Improve01 {
	//构造器私有化
	private Singleton03Improve01(){
	}
	
	private static class SingletonFactory{
		public static Singleton03Improve01 instance = new Singleton03Improve01();
	}
	
	public static Singleton03Improve01 getInstance(){
		return SingletonFactory.instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
		return getInstance();  
	}  
}
