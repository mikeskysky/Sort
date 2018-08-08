package com.mike.sort.leecode;

public class ContainsDuplicate {
	public static void main(String[] args) 
	{
		ContainsDuplicate cd=new ContainsDuplicate();
		int[] nums= {0,1,2,3,2,5};
		int k=3;
		System.out.println(cd.containsNearbyDuplicate(nums, k));
	}
	public boolean containsNearbyDuplicate(int[] nums, int k) 
	{
		if(nums==null||nums.length<1||k==0)return false;
		int start=0;
		boolean flag=false;
		while(start<nums.length)
		{
			if(start+k<nums.length)
			{
				if(nums[start]==nums[start+k])
				{
					flag=true;
					break;
				}
				else
				{
					start++;
				}
			}
			else
			{
				if(k==1)break;
				k--;
				start=0;
			}
		}
		return flag;
	}
}
