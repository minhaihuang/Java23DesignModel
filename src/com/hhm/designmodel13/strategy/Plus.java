package com.hhm.designmodel13.strategy;

/**
 * 实现类一。加法
 * @author huanghaimin
 *
 */
public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String exp) {
		int[] arr = split(exp, "\\+");
		return arr[0] + arr[1];
	}

}
