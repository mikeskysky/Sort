package com.mike.sort.heersort;

import java.util.Arrays;
/**
 * 希尔排序
 * @author Administrator
 *
 */
public class HeerSort
{
	public static void main(String[] args) 
	{
		int[] arr={12,34,5,67,87,54}; 
		heerSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heerSort(int[] arr)
	{
		int d=arr.length;
		while(true)
		{
			for(int i=0;i<d;i++)
			{
				for(int j=i;j+d<arr.length;j+=d)
				{
					if(arr[j]>arr[j+d])
					{
						int temp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
					}
				}
			}	
			if(d==1) {break;}
			d=d-1;
		}
	}
}
