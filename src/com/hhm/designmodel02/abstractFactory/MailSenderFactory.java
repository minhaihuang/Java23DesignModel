package com.hhm.designmodel02.abstractFactory;

public class MailSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
