 package com.mike.sort.leecode;

public class CoinChangeTest 
{
	public int[] moneys= {100,50,20,10,5,1};
	public static void main(String[] args) 
	{
		CoinChangeTest cct=new CoinChangeTest();
		System.out.println(cct.makeChange(194));
	}
	
	public int makeChange(int money)
	{
		int times=0;
		if(money>=100)
		{
			times=money/100;
			money=money-times*100;
		}
		if(money==0)
		{
			return times;
		}
		int i;
		for(i=1;i<moneys.length;i++)
		{
			if(money>=moneys[i]&&money<moneys[i-1])
			{
				break;
			}
		}
		int month1=money-moneys[i];
		int month2=moneys[i-1]-money;
		int best=month1>=month2?month2:month1;
		++times;
		if(best!=0)
		{
			times+=makeChange(best);
		}
		return times;
	}
}
