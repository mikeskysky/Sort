package com.mike.sort.yuesefu;

public class YueSefu 
{
	public static int N=20;//人数
	public static int M=5;//数到M就退出
	public static void main(String[] args) {
		YueSefu ys=new YueSefu();
		ys.killNode();
	}
	
	public void killNode()
	{
		Node header=new Node(1);
		Node x=header;
		for(int i=2;i<=N;i++)
		{
			x=(x.next=new Node(i));
		}
		x.next=header;
		while(x.next!=x)
		{
			for(int i=1;i<M;i++)
			{
				x=x.next;
			}
			System.out.println("退出:"+x.next.val);
			x.next=x.next.next;
		}
		System.out.println("存活"+x.val);
	}
	
	class Node
	{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
}
