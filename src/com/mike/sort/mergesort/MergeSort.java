package com.mike.sort.mergesort;

import java.util.Arrays;

/**
 * 归并排序
 *
 */
public class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] arr= {23,4,56,7,53,5,8};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr,int left,int right)
	{
		if(left<right)
		{
			int middle=(left+right)/2;
			mergeSort(arr, 0, middle);
			mergeSort(arr, middle+1, right);
			merge(arr,left,middle,right);
		}
	}

	private static void merge(int[] arr, int left, int middle,int right) {
		int[] tempArr=new int[arr.length];
		int rightStart=middle+1;
		int third=left;
		int temp=left;
		while(left<=middle&&rightStart<=right)
		{
			if(arr[left]<=arr[rightStart])
			{
				tempArr[third++]=arr[left++];
			}
			else
			{
				tempArr[third++]=arr[rightStart++];
			}
		}
		while(left<=middle)
		{
			tempArr[third++]=arr[left++];
		}
		while(rightStart<=right)
		{
			tempArr[third++]=arr[rightStart++];
		}
		while(temp<=right)
		{
			arr[temp]=tempArr[temp++];
		}
	}
}
