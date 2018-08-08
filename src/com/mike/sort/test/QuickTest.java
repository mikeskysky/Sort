package com.mike.sort.test;

import java.util.Arrays;

public class QuickTest 
{
	public static void main(String[] args) {
		int[] nums= {12,34,56,7,8,9,6,5};
		QuickTest qt=new QuickTest();
		qt.sort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	
	public void sort(int[] nums,int left,int right)
	{
		if(left<right)
		{
			int pos=getPostion(nums,left,right);
			sort(nums,left,pos);
			sort(nums, pos+1, right);
		}
	}

	private int getPostion(int[] nums, int left, int right) {
		int temp=nums[left];
		while(left<right)
		{
			while(left<right&&nums[right]>=temp)
			{
				right--;
			}
			nums[left]=nums[right];
			while(left<right&&nums[left]<=temp)
			{
				left++;
			}
			nums[right]=nums[left];
		}
		nums[left]=temp;
		return left;
	}
}
