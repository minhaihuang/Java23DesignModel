package com.hhm.designmodel06.adapter.classAdapter;
// 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
/**
 * 源类
 * @author huanghaimin
 *
 */
public class Source {
	public void method1(){
		System.out.println("this is source method1");
	}
}
