package com.mike.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) 
	{
		ThreeSum ts=new ThreeSum();
		int[] nums= {-1, 0, 1, 2, -1, -4};
		System.out.println(ts.threeSum(nums));
	}
	public List<List<Integer>> threeSum(int[] nums) {
		//首先排序
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-2;i++)
		{
			if(i>0&&nums[i]==nums[i-1])continue;
			if(nums[i]>0)continue;
			int left=i+1;int right=nums.length-1;
			int sum=0-nums[i];
			while(left<right)
			{
				if(nums[left]+nums[right]==sum)
				{
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while(left<right&&nums[left]==nums[left+1])
					{
						left++;
					}
					while(left<right&&nums[right]==nums[right-1])
					{
						right--;
					}
					left++;
					right--;
				}
				else if(nums[left]+nums[right]>sum)
				{
					right--;
				}
				else
				{
					left++;
				}
				
			}
		}
		return list;
	}
}
