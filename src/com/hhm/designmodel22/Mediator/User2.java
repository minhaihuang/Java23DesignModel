package com.hhm.designmodel22.Mediator;

public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 work");
	}

}
