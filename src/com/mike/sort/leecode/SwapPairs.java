package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class SwapPairs {
	public static void main(String[] args) 
	{
		 SwapPairs sp=new SwapPairs();
		 ListNode node1=new ListNode(1);
		 ListNode node2=new ListNode(2);
		 ListNode node3=new ListNode(3);
		 node1.next=node2;node2.next=node3;
		 show(sp.swapPairs(null));
	}
	
	private static void show(ListNode swapPairs) {
		while(swapPairs!=null)
		{
			System.out.print(swapPairs.val);
			swapPairs=swapPairs.next;
		}
	}
	public ListNode swapPairs(ListNode head) 
	{
		List<Integer> list=new ArrayList<Integer>();
		ListNode temp=head;
		while(temp!=null)
		{
			list.add(temp.val);
			temp=temp.next;
		}
		for(int i=0;i<list.size();i++)
		{
			if(i%2==0&&(i+1)<list.size())
			{
				int tempInt=list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1,tempInt);
			}
		}
		if(list.size()<0)return null;
		ListNode headNode=new ListNode(list.get(0));
		ListNode headNodeT=headNode;
		for(int i=1;i<list.size();i++)
		{
			headNodeT=headNodeT.next=new ListNode(list.get(i));
		}
		return headNode;
	}
}
