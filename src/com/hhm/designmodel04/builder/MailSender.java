package com.hhm.designmodel04.builder;
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
