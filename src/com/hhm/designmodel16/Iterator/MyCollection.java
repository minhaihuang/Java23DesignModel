package com.hhm.designmodel16.Iterator;

public class MyCollection implements Collection{
	private Object[] object;
	
	public MyCollection(Object[] object){
		this.object = object;
	}

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return object[i];
	}

	@Override
	public int size() {
		return object.length;
	}
	
	
}
