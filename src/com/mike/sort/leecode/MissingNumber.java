package com.mike.sort.leecode;

public class MissingNumber {
	public static void main(String[] args) 
	{
		MissingNumber mm=new MissingNumber();
		int[] nums= {9,6,4,2,3,5,7,0,1};
		System.out.println(mm.missingNumber(nums));
	}
	public int missingNumber(int[] nums) {
		int len=nums.length;
		int start=0;
		int result=0;
		while(start<len)
		{
			result+=nums[start];
			start++;
		}
		return (len)*((len+1)/2)-result;
	}
}
