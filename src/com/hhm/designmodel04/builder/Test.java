package com.hhm.designmodel04.builder;

import java.util.List;

/**
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * @author huanghaimin
 *
 */
public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		List<Sender> list = builder.produceMailSender(10);
		System.out.println(list.size());
	}
}
