package com.hhm.designmodel15.Observer;

public class MySubject extends AbstractSubject{

	/*更新自身，并通知相关对象*/
	@Override
	public void operation() {
		System.out.println("mysubject operation");
		notifyObservers();
	}

}
