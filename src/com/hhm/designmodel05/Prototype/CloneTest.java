package com.hhm.designmodel05.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 测试深复制和浅复制
 * 
 * @author huanghaimin
 *
 */
public class CloneTest implements Cloneable,Serializable{
	private User user;
	/**
	 * 浅复制
	 * @throws CloneNotSupportedException 
	 */
	public CloneTest shallowClone() throws CloneNotSupportedException{
		CloneTest cloneTest = (CloneTest) super.clone();//用的是Object的super()方法
		return cloneTest;
	}
	
	/**
	 * 深复制
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public CloneTest deepClone() throws IOException, ClassNotFoundException{
		/* 写入当前对象的二进制流 */ 
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/* 读出二进制流产生的新对象 */  
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (CloneTest) ois.readObject();
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}

class User implements Serializable {
	private String name;
	private String agel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgel() {
		return agel;
	}

	public void setAgel(String agel) {
		this.agel = agel;
	}

}
