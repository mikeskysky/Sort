package com.mike.sort.leecode;

public class GetSum {
	public static void main(String[] args) 
	{
		GetSum gs=new GetSum();
		System.out.println(gs.getSum(3, 6));
	}
	public int getSum(int a, int b) {
		int temp1=a^b;
		int temp2=a&b;
		if(temp2!=0)
		{
			return getSum(temp1, temp2<<1);
		}
		else
		{
			return temp1;
		}
	}
}
