package com.hhm.designmodel01.factory.staticFactory;
/**
 * 静态工厂模式适用于：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。这里修正了前面两个工厂模式的缺陷，即需要
 * 传正确的类型名称和需要创建工厂实体这两个缺陷。
 * 
 *  大多数情况下，我们会选用第三种——静态工厂方法模式
 * @author huanghaimin
 *
 */
public class Test {
	public static void main(String[] args) {
		Sender sender = SenderFactory.produceMailSender();
		if(sender != null){
			sender.send();
		}else{
			System.out.println("无法识别的类型");
		}
	}
}
