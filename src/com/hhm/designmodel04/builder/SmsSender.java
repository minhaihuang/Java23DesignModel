package com.hhm.designmodel04.builder;
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
