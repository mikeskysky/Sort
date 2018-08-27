package com.mike.sort.leecode;

import java.util.HashSet;
import java.util.Set;

public class _41FirstMissingPositive {
	
	public static void main(String[] args) {
		_41FirstMissingPositive fmp=new _41FirstMissingPositive();
		int[] nums= {0,1,2};
		System.out.println(fmp.firstMissingPositive(nums));
	}
	public int firstMissingPositive(int[] nums) {
		if(nums==null||nums.length<1)return 1;
		Set<Integer> map=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			map.add(nums[i]);
		}
		int i;
		for(i=1;i<nums.length+1;i++)
		{
			if(!map.contains(i))
			{
				break;
			}
		}
		return i;
	}
}
