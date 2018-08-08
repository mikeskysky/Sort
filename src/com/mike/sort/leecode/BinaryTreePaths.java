package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public static void main(String[] args) 
	{
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node5=new TreeNode(5);
		node1.left=node2;node1.right=node3;
		node2.right=node5;
		BinaryTreePaths bt=new BinaryTreePaths();
		List<String> list = bt.binaryTreePaths(node1);
		System.out.println(list);
	}
	public List<String> binaryTreePaths(TreeNode root) {
		if(root==null)return new ArrayList<String>();
		List<String> list=new ArrayList<String>();
		priTreePath(list,root,String.valueOf(root.val));
		return list;
	}

	private void priTreePath(List<String> list, TreeNode root,String val) {
		if(root!=null&&root.left==null&&root.right==null)
		{
			list.add(val);
			return;
		}
		if(root.left!=null)
		{
			priTreePath(list, root.left, val+"->"+root.left.val);
		}
		if(root.right!=null)
		{
			priTreePath(list, root.right, val+"->"+root.right.val);
		}
	}
}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }