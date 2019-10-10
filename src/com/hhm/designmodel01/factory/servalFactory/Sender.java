package com.hhm.designmodel01.factory.servalFactory;
/**
 * 多方法普通工厂模式适用于：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。相对于普通工厂而言，改进了对象名称
 * 不正确就无法创建对象的问题，但是还存在一个缺陷。
 * （1）工厂需要实例化。
 * @author huanghaimin
 *
 */
public interface Sender {
	public void send();
}
