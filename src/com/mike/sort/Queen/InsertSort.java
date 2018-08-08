package com.mike.sort.Queen;

import java.util.Arrays;

public class InsertSort 
{
	public static void main(String[] args) 
	{
		InsertSort is=new InsertSort();
		int[] arr= {12,3,45,6};
		is.insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void insertSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(temp<arr[j])
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
