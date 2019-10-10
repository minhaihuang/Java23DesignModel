package com.hhm.designmodel21.Visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Vistor vistor) {
		vistor.visit(this);
	}

	@Override
	public void getSubject() {
		System.out.println("hhh");
	}

}
