package com.hhm.designmodel11.Composite;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便。
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author huanghaimin
 *
 */
public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(String name ){
		this.name = name;
	}
	
	public void add(TreeNode son){
		children.add(son);
		son.setParent(this);
	}
	
	public void remove(TreeNode son){
		children.remove(son);
	}
	
	public Enumeration<TreeNode> getChildrens(){
		return children.elements();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public Vector<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}

}
