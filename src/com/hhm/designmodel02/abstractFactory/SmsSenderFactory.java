package com.hhm.designmodel02.abstractFactory;

public class SmsSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
