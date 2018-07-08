package com.mike.sort.binaryinsertsort;

import java.util.Arrays;
/**
 * 二分插入排序
 * @author Administrator
 *
 */
public class BinaryInsertSort 
{
	public static void main(String[] args) 
	{
		int[] arr={12,34,5,67,87,54};
		binaryInsertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void binaryInsertSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];//需要插入排序的数字
			int left=0;
			int right=i-1;
			int middle=0;
			while(left<=right)
			{
				middle=(left+right)/2;
				if(arr[middle]>temp)
				{
					right=middle-1;
				}
				else
				{
					left=middle+1;
				}
			}
			for(int j=i-1;j>=left;j--)
			{
				arr[j+1]=arr[j];
			}
			if(left!=i)
			{
				arr[left]=temp;
			}
		}
	}
}
