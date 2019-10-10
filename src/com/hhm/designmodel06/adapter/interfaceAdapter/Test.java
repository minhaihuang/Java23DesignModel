package com.hhm.designmodel06.adapter.interfaceAdapter;
/**
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 * @author huanghaimin
 *
 */
public class Test {
	public static void main(String[] args) {
		Son1 son1 = new Son1();
		son1.method1();
		
		Son2 son2 = new Son2();
		son2.method2();
	}
}
