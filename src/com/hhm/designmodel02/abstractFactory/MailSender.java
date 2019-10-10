package com.hhm.designmodel02.abstractFactory;
/**
 * @author huanghaimin
 *
 */
public class MailSender implements Sender{
	@Override
	public void send() {
		System.out.println("this is mailSender");
	}
}
