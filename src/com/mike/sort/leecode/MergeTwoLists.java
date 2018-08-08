package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	
	public static void main(String[] args) 
	{
		MergeTwoLists mt=new MergeTwoLists();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(1);
		ListNode node5=new ListNode(2);
		ListNode node6=new ListNode(4);
		node1.next=node2;node2.next=node3;
		node4.next=node5;node5.next=node6;
		show(mt.mergeTwoLists(node1, node4));
	}
	
	private static void show(ListNode node) {
		while(node!=null)
		{
			System.out.print(node.val+"->");
			node=node.next;
		}
	}
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<Integer>();
		while(l1!=null)
		{
			list1.add(l1.val);
			l1=l1.next;
		}
		while(l2!=null)
		{
			list2.add(l2.val);
			l2=l2.next;
		}
		int start1=0;
		int start2=0;
		while(start1<list1.size()&&start2<list2.size())
		{
			if(list1.get(start1)<list2.get(start2))
			{
				list3.add(list1.get(start1++));
			}
			else
			{
				list3.add(list2.get(start2++));
			}
		}
		while(start1<list1.size())
		{
			list3.add(list1.get(start1++));
		}
		while(start2<list2.size())
		{
			list3.add(list2.get(start2++));
		}
		if(list3.size()<1)return null;
		ListNode head1=new ListNode(list3.get(0));
		ListNode head=head1;
		for(int i=1;i<list3.size();i++)
		{
			head=head.next=new ListNode(list3.get(i));
		}
		return head1;
	}
}
