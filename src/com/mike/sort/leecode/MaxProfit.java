package com.mike.sort.leecode;

public class MaxProfit {
	public static void main(String[] args) 
	{
		int[] arr= {7,1,5,3,6,4};
		MaxProfit pm=new MaxProfit();
		System.out.println(pm.maxProfit(arr));
	}

	public int maxProfit(int[] prices) {
		int current=prices[0];
		int max=0;
		int sum=0;
		for(int i=1;i<prices.length;i++)
		{
			if(current>prices[i])
			{
				current=prices[i];
			}
			else
			{
				sum=prices[i]-current;
				if(sum>max)max=sum;
			}
		}
		return max;
	}
	
	public int getCount(int[] prices)
	{
		if(prices==null||prices.length<1)return 0;
		int max=0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]-prices[i-1]>0)
			{
				max+=prices[i]-prices[i-1];
			}
		}
		return max;
	}
}
