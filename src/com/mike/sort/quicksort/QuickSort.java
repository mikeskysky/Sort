package com.mike.sort.quicksort;

import java.util.Arrays;

/**
 * 快速排序
 * @author Administrator
 *
 */
public class QuickSort 
{
	public static void main(String[] args) 
	{
		int[] arr= {23,4,56,7,53,5,8};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int left,int right)
	{
		if(left<right)
		{
			int middle=getMiddle(arr,left,right);
			quickSort(arr, 0, middle);
			quickSort(arr, middle+1, right);
		}
	}

	private static int getMiddle(int[] arr, int left, int right) {
		int temp=arr[left];
		while(left<right)
		{
			while(left<right&&arr[right]>=temp)
			{
				right--;
			}
			arr[left]=arr[right];
			while(left<right&&arr[left]<=temp)
			{
				left++;
			}
			arr[right]=arr[left];
		}
		arr[left]=temp;
		return left;
	}
}
