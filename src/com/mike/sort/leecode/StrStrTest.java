package com.mike.sort.leecode;

public class StrStrTest {
	public static void main(String[] args) {
		StrStrTest test=new StrStrTest();
		int[] arr= {1,2,3,6,-1,-3};
		System.out.println(test.strStr(arr));
	}

	public int strStr(int[] arr) {
		int cur=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			cur=Math.max(cur+arr[i],arr[i]);
			if(cur>sum)sum=cur;
		}
		return sum;
	}
}
