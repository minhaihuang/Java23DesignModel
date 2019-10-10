package com.hhm.designmodel08.proxy;

public class Test {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
