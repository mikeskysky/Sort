
package com.mike.sort.leecode;

import java.util.Arrays;

public class SortTest 
{
	public static void main(String[] args) 
	{
		int[] nums= {12,3,45,67,8};
		SortTest st=new SortTest();
		st.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * 冒泡排序
	 * @param nums
	 */
	public void bubboSort(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length-1-i;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
	
	/**
	 * 插入排序
	 * @param nums
	 */
	public void insertSort(int[] nums)
	{
		for(int i=1;i<nums.length;i++)
		{
			int temp=nums[i];
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(temp<nums[j])
				{
					nums[j+1]=nums[j];
				}
				else
				{
					break;
				}
			}
			nums[j+1]=temp;
		}
	}
}
