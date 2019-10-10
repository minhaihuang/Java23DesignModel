package com.hhm.designmodel03.singleton;
/**
 * 单例模式貌似完美版2。考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。线程也有保护。
 * @author huanghaimin
 *
 */
public class Singleton03Improve02 {
	private static Singleton03Improve02 instance = null;
	
	private Singleton03Improve02(){
		
	}
	
	private static synchronized Singleton03Improve02 synInit(){
		instance = new Singleton03Improve02();
		
		return instance;
	}

	
	public static Singleton03Improve02 getInstance(){
		if(instance == null){
			return synInit();
		}
		
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
		return getInstance();  
	}  
}
