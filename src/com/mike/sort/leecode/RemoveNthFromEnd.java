package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {
	public static void main(String[] args) 
	{
		RemoveNthFromEnd rn=new RemoveNthFromEnd();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		node1.next=node2;node2.next=node3;node3.next=node4;
		show(rn.removeNthFromEnd(node1, 4));
	}
	private static void show(ListNode node) {
		while(node!=null)
		{
			System.out.print(node.val+"->");
			node=node.next;
		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null)return null;
		List<Integer> stack=new ArrayList<Integer>();
		while(head!=null)
		{
			stack.add(head.val);
			head=head.next;
		}
		stack.remove(stack.size()-n);
		if(stack.size()<1)return null;
		ListNode result=new ListNode(stack.get(0));
		ListNode temp=result;
		for(int i=1;i<stack.size();i++)
		{
			temp=(temp.next=new ListNode(stack.get(i)));
		}
		return result;
	}
}
