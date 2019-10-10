package com.hhm.designmodel16.Iterator;

public interface Collection {
	public Iterator iterator();//获取迭代器

	public Object get(int i);// 获取指定索引的元素

	public int size();// 容器的大小
}
