package com.hhm.designmodel12.Flyweight;

import java.util.Vector;

/**
 * 享元模式 : 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 * 
 * FlyWeightFactory负责创建和管理享元单元，当一个客户端请求时，工厂需要检查当前对象池中是否有符合条件的对象，
 * 如果有，就返回已经存在的对象，如果没有，则创建一个新对象，FlyWeight是超类。一提到共享池，我们很容易联想到Java里面的JDBC连接池，
 * 想想每个连接的特点，我们不难总结出：适用于作共享的一些个对象，他们有一些共有的属性，就拿数据库连接池来说，url、driverClassName、username、password及dbname，
 * 这些属性对于每个连接来说都是一样的，所以就适合用享元模式来处理，建一个工厂类，将上述类似属性作为内部数据，其它的作为外部数据，在方法调用时，当做参数传进来，
 * 这样就节省了空间，减少了实例的数量。
 * 
 * @author huanghaimin
 */
public class ConnectionPool {
	
		private Vector<Connection> pool = null;//连接池
	
		private String driverName = "com.mysql.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/test"; 
		private String userName = "root";
		private String password = "123456";
		
		private int poolSize = 100;//初始连接池的数量
		private static ConnectionPool instance = null;
		
		Connection conn = null;
		
		//初始化的时候便构造连接池
		private ConnectionPool(){
			pool = new Vector<Connection>(poolSize);
			
			try {
				Class.forName(driverName);
				for(int i = 0; i < poolSize; i++){
					conn = DriverManager.getConnection(url, userName, password);
					pool.add(conn);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public synchronized void release(){
			pool.add(conn);
		}
		
		public synchronized Connection getConnection(){
			if(pool.size()>0){
				Connection conn = pool.get(0);
				pool.remove(conn);
				return conn;
			}else{
				return null;
			}
		}
		
		public static ConnectionPool getInstance(){
			if(instance == null){
				return init();
			}
			
			return instance;
		}
		
		private static synchronized ConnectionPool init(){
			instance = new ConnectionPool();
			return instance;
		}
}
