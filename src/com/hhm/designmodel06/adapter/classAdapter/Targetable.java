package com.hhm.designmodel06.adapter.classAdapter;
// 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
public interface Targetable {
	public void method1();//与源类Source的方法名一致
	public void method2();//新类的方法
}
