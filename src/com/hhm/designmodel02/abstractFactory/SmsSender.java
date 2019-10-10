package com.hhm.designmodel02.abstractFactory;
/**
 * @author huanghaimin
 *
 */
public class SmsSender implements Sender{
	
	@Override
	public void send() {
		System.out.println("this is smsSender");
	}
}
