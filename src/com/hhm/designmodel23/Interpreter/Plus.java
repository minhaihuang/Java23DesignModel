package com.hhm.designmodel23.Interpreter;

public class Plus implements Expression{
	@Override
	public int interpret(Context context) {
		
		return context.getNum1() + context.getNum2();
	}
}