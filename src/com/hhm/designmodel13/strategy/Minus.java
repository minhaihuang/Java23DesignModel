package com.hhm.designmodel13.strategy;
/**
 * 实现类2：减法
 * @author huanghaimin
 *
 */
public class Minus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String exp) {
		int[] arr = split(exp, "\\-");
		return arr[0] - arr[1];
	}

}
