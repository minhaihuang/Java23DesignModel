package com.hhm.designmodel17.Chain_of_Responsibility;

public class MyHandler extends AbstractHandler implements Handler{
	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void handle() {
		System.out.println(name+" deal!");
		if(getHandler() != null){
			getHandler().handle();
		}
	}

}
