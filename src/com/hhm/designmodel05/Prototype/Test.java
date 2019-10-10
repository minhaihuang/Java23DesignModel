package com.hhm.designmodel05.Prototype;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		User user = new User();
		user.setName("hhh");
		CloneTest cloneTest = new CloneTest();
		cloneTest.setUser(user);
		//浅复制
		CloneTest cloneTest2 = cloneTest.shallowClone();
		System.out.println(cloneTest2.getUser().getName());
		
		//深复制
		CloneTest cloneTest3 = cloneTest.deepClone();
		System.out.println(cloneTest3.getUser().getName());
		
		System.out.println("改变user值");
		
		user.setName("hhh2");
		
		System.out.println("浅复制改变值后的结果："+cloneTest2.getUser().getName());
		System.out.println("深复制改变值后的结果："+cloneTest3.getUser().getName());
	}
}
