package com.mike.sort.basesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 基数排序
 * @author Administrator
 *
 */
public class BasicSort 
{
	public static void main(String[] args) 
	{
		int[] arr= {23,4,56,7,53,5,8};
		basicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void basicSort(int[] arr)
	{
		//获取最大值
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//需要排序几次
		int times=0;
		while(max>0)
		{
			max=max/10;
			times++;
		}
		List<ArrayList> queue=new ArrayList<ArrayList>();
		for(int i=0;i<10;i++)
		{
			ArrayList q=new ArrayList();
			queue.add(q);
		}
		for(int i=0;i<times;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				//得到个位，十位，百位
				int x=arr[j]%(int)(Math.pow(10, i+1))/(int)Math.pow(10, i);
				ArrayList q= queue.get(x);
				q.add(arr[j]);
				queue.set(x, q);
			}
			//开始收集
			int count=0;
			for(int j=0;j<10;j++)
			{
				while(queue.get(j).size()>0)
				{
					ArrayList<Integer> list = queue.get(j);
					arr[count]=list.get(0);
					list.remove(0);
					count++;
				}
			}	
		}
		
	}
}
