package com.hhm.designmodel06.adapter.interfaceAdapter;
/**
 * 子类1。继承抽象类，只实现自己想要的方法
 * @author huanghaimin
 *
 */
public class Son1 extends AbstractWrapper{
	@Override
	public void method1() {
		System.out.println("this is son1 method1");
	}
}
