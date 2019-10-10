package com.hhm.designmodel23.Interpreter;

public class Test {
	public static void main(String[] args) {
		//计算8+2-9
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(8, 2)), 9));
		System.out.println(result);
	}
}
