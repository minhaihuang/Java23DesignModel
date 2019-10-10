package com.hhm.designmodel17.Chain_of_Responsibility;

public abstract class AbstractHandler implements Handler{
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
