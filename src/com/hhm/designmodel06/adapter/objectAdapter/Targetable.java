package com.hhm.designmodel06.adapter.objectAdapter;
//对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
public interface Targetable {
	public void method1();//与源类Source的方法名一致
	public void method2();//新类的方法
}
