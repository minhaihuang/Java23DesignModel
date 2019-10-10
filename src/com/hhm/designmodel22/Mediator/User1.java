package com.hhm.designmodel22.Mediator;

public class User1 extends User{

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 work");
	}

}
