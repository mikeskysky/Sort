package com.mike.sort.test;

import java.util.Arrays;

public class MergeSort 
{
	public static void main(String[] args) {
		int[] nums= {12,34,56,7,8,9,6,5};
		MergeSort ms=new MergeSort();
		ms.sort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	
	public void sort(int[] nums,int left,int right)
	{
		if(left<right)
		{
			int middle=(left+right)/2;
			sort(nums, 0, middle);
			sort(nums, middle+1, right);
			mergeSort(nums,left,middle,right);
		}
	}

	private void mergeSort(int[] nums, int left, int middle, int right) {
		int rightStart=middle+1;
		int begin=left;
		int thrid=left;
		int end=right;
		int[] news=new int[nums.length];
		while(left<=middle&&rightStart<=right)
		{
			if(nums[left]<nums[rightStart])
			{
				news[begin++]=nums[left++];
			}
			else
			{
				news[begin++]=nums[rightStart++];
			}
		}
		while(left<=middle)
		{
			news[begin++]=nums[left++];
		}
		while(rightStart<=right)
		{
			news[begin++]=nums[rightStart++];
		}
		for(int i=thrid;i<=end;i++)
		{
			nums[i]=news[i];
		}
	}
}
