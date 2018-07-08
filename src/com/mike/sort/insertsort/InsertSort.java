package com.mike.sort.insertsort;

import java.util.Arrays;

/**
 *插入排序
 *
 */
public class InsertSort 
{
	public static void main(String[] args) 
	{
		int[] arr={12,34,5,67,87,54};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];//需要排序的的数字
			int j;
			for(j=i-1;j>=0;j--)
			{
				//当前值比要插入的数值大，那么就向后移动
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
}
