package com.mike.sort.leecode;

public class IntersectionNode {
	
	public static void main(String[] args) 
	{
		IntersectionNode is=new IntersectionNode();
		ListNode headA=new ListNode(1);
		ListNode headB=new ListNode(1);
		System.out.println(is.getIntersectionNode(headA, headB));
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
	{
		if(headA==null||headB==null)return null;
		ListNode x=headA;
		ListNode lastx = null;
		ListNode B=headB;
		ListNode lastb=null;
		int lenA=0;
		int lenB=0;
		while(x!=null)
		{
			lastx=x;
			x=x.next;
			lenA++;
		}
		while(B!=null)
		{
			lastb=B;
			B=B.next;
			lenB++;
		}
		if(lastx.val!=lastb.val)
		{
			return null;
		}
		else
		{
			int skipNum=0;
			if(lenA>lenB)
			{
				skipNum=lenA-lenB;
				for(int i=0;i<skipNum;i++)
				{
					headA=headA.next;
				}
				for(int i=0;i<lenB;i++)
				{
					if(headA.val==headB.val)
					{
						return headA;
					}
					else
					{
						headA=headA.next;
						headB=headB.next;
					}
				}
			}
			else if(lenA<lenB)
			{
				skipNum=lenB-lenA;
				for(int i=0;i<skipNum;i++)
				{
					headB=headB.next;
				}
				for(int i=0;i<lenA;i++)
				{
					
					if(headA.val==headB.val)
					{
						return headA;
					}
					else
					{
						headA=headA.next;
						headB=headB.next;
					}
				}
			}
			else
			{
				for(int i=0;i<lenA;i++)
				{
					if(headA.val==headB.val)
					{
						return headA;
					}
					else
					{
						headA=headA.next;
						headB=headB.next;
					}
				}
			}
		}
		return null;
	}
}
