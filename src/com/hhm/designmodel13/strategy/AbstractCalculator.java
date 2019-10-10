package com.hhm.designmodel13.strategy;

/**
 * 抽象类（可有可无）。提供辅助算法。
 * 
 * @author huanghaimin
 *
 */
public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
