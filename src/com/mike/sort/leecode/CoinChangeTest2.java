package com.mike.sort.leecode;

public class CoinChangeTest2 
{
	public int[] coins={100,50,20,10,5,1};
	
	public static void main(String[] args) 
	{
		CoinChangeTest2 ct2=new CoinChangeTest2();
		System.out.println(ct2.makeChange(60));
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
		for(i=1;i<coins.length;i++)
		{
			if(coins[i]<=money&&coins[i-1]>=money)
			{
				break;
			}
		}
		int month1=money-coins[i];
		int month2=coins[i-1]-money;
		int best=month1>month2?month2:month1;
		times++;
		if(best!=0)
		{
			times+=makeChange(best);
		}
		return times;
	}
}
