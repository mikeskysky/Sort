package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class ReverseKGroup {
	
	public static void main(String[] args) 
	{
		ReverseKGroup rg=new ReverseKGroup();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		node1.next=node2;node2.next=node3;node3.next=node4;node4.next=node5;
		show(rg.reverseKGroup(node1, 5));
	}
	
	public static void show(ListNode had)
	{
		while(had!=null)
		{
			System.out.print(had.val);
			had=had.next;
		}
	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> resultList=new ArrayList<Integer>();
		ListNode headTemp=head;
		while(headTemp!=null)
		{
			list.add(headTemp.val);
			headTemp=headTemp.next;
		}
		if(k>list.size())
		{
			return head;
		}
		int count=list.size()/k;
		for(int i=0;i<count;i++)
		{
			int begin=i*k;
			int end=(i+1)*k;
			List<Integer> list2 = list.subList(begin,end);
			resultList.addAll(swap(list2));
		}
		if(resultList.size()<1)return null;
		if(list.size()/k!=0)
		{
			resultList.addAll(list.subList(count*k,list.size()));
		}
		ListNode headNode=new ListNode(resultList.get(0));
		ListNode tempNode=headNode;
		for(int i=1;i<resultList.size();i++)
		{
			tempNode=tempNode.next=new ListNode(resultList.get(i));
		}
		return headNode;
	}

	private List<Integer> swap(List<Integer> list2) {
		for(int i=0;i<list2.size()/2;i++)
		{
			int temp=list2.get(i);
			int temp2=list2.get(list2.size()-i-1);
			list2.set(list2.size()-1-i,temp);
			list2.set(i, temp2);
		}
		return list2;
	}
}
