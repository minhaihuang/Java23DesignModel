package com.hhm.designmodel20.State;

public class State {
	private int value;//状态码

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public void method1(){
		System.out.println("this is method1");
	}
	
	public void method2(){
		System.out.println("this is method2");
	}
}
