package com.mike.sort.leecode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {
		SingleNumber sm=new SingleNumber();
		int[] nums= {2,2,1,1,3,4,3};
		System.out.println(sm.singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
		int result =nums[0];
        for(int i = 1; i < nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
	}
}
