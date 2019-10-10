package com.hhm.designmodel11.Composite;

import java.util.Enumeration;

/**
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便。
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author huanghaimin
 *
 */
public class Test {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode("root");
		TreeNode A = new TreeNode("A");
		TreeNode B = new TreeNode("B");
	
		TreeNode C = new TreeNode("C");
		TreeNode D = new TreeNode("D");
		
		A.add(C);
		B.add(D);
		root.add(A);
		root.add(B);
		
		System.out.println(A.getParent().getName());
		System.out.println(B.getParent().getName());
		System.out.println(C.getParent().getName());
		System.out.println(D.getParent().getName());
		
		//遍历根节点下的直接子节点
		Enumeration<TreeNode> rootSonelements = root.getChildrens();
		while (rootSonelements.hasMoreElements()) {
			TreeNode treeNode = (TreeNode) rootSonelements.nextElement();
			System.out.println(treeNode.getName());
		}
		
	}
}
