package com.mike.sort.leecode;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) 
	{
		ThreeSumClosest tm=new ThreeSumClosest();
		int[] nums= {1,1,1,1};
		int target=0;
		System.out.println(tm.threeSumClosest(nums, target));
	}
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result=Integer.MAX_VALUE;
		int realResult=Integer.MAX_VALUE;
		boolean flag=true;
		for(int i=0;i<nums.length-2&&flag;i++)
		{
			if(i>0&&nums[i]==nums[i-1])continue;
			if(nums[i]>target&&i>0)continue;
			int left=i+1;int right=nums.length-1;
			while(left<right)
			{
				int current=nums[i]+nums[left]+nums[right];
				if(current>target)
				{
					right--;
					if(current-target<result)
					{
						result=current-target;
						realResult=current;
					}
				}
				else if(current<target)
				{
					left++;
					if(target-current<result)
					{
						result=target-current;
						realResult=current;
					}
				}
				else
				{
					result=current;
					realResult=current;
					flag=false;
					break;
				}
			}
		}
		return realResult;
	}
}
