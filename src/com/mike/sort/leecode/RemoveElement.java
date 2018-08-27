package com.mike.sort.leecode;

public class RemoveElement {
	public static void main(String[] args) 
	{
		RemoveElement re=new RemoveElement();
		int[] nums= {0,1,2,2,3,0,4,2};
		System.out.println(re.removeElement(nums, 2));
	}
	public int removeElement(int[] nums, int val) {
		int count=0;
		for(int i=0;i<nums.length-count;i++)
		{
			if(val==nums[i])
			{
				count++;
				nums[i]=nums[nums.length-count];
				i--;
			}
		}
		return nums.length-count;
	}
}
