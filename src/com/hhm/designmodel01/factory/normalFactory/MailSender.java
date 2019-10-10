package com.hhm.designmodel01.factory.normalFactory;
/**
 * 普通的工厂模式适用于：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。但是这里存在两个缺陷。
 * （1）工厂需要实例化。
 * （2）当传入不存在的对象名称的时间，就不能创建实体。
 * @author huanghaimin
 *
 */
public class MailSender implements Sender{
	@Override
	public void send() {
		System.out.println("this is mailSender");
	}
}
