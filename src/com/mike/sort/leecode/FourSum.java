package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	public static void main(String[] args) 
	{
		FourSum fs=new FourSum();
		int[] nums= {-1,0,-5,-2,-2,-4,0,1,-2};
		int target=-9;
		System.out.println(fs.fourSum(nums, target));
	}
	public List<List<Integer>> fourSum(int[] nums, int target) 
	{
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		if(nums==null||nums.length<4)return list;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-3;i++)
		{
			if(i>0&&nums[i]==nums[i-1])continue;
			if(nums[i]>target&&nums[i]>0)break;
			for(int j=i+1;j<nums.length-2;j++)
			{
				if(nums[i]+nums[j]>target&&(nums[i]>0&&nums[j]>0))break;
				int left=j+1;int right=nums.length-1;
				while(left<right)
				{
					int temp=nums[i]+nums[j]+nums[left]+nums[right];
					if(temp==target)
					{
						if(!list.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right])))
						{
							list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						}
						left++;
						right--;
					}
					else if(temp>target)
					{
						right--;
					}
					else {
						left++;
					}
				}
			}
		}
		return list;
	}
}
