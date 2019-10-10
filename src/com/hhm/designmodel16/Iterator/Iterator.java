package com.hhm.designmodel16.Iterator;

public interface Iterator {
	//是否还有更多元素
	public boolean hashNext();
	//获取下一个元素
	public Object next();
	
	//获取第一个元素
	public Object first();
	//获取前一个元素
	public Object pervious();
	
}
