package com.mike.sort.leecode;

public class ThreeMax 
{
	public static void main(String[] args) 
	{
		ThreeMax tm=new ThreeMax();
		int[] nums= {1,2,-2147483648};
		System.out.println(tm.threeMax(nums));
	}
	public int threeMax(int[] nums)
	{
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int threeMax=Integer.MIN_VALUE;
		boolean flag=false;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
			{
				max=nums[i];
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max2&&nums[i]<max)
			{
				max2=nums[i];
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>=threeMax&&nums[i]<max2)
			{
				threeMax=nums[i];
				flag=true;
			}
		}
		return flag?threeMax:max;
	}
}
