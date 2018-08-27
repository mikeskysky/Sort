package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39CombinationSum {
	
	public static void main(String[] args) 
	{
		_39CombinationSum cs=new _39CombinationSum();
		int[] candidates= {2,3,5};
		System.out.println(cs.combinationSum(candidates, 8));
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> item=new ArrayList<Integer>();
		if(candidates==null||candidates.length<1)return result;
		Arrays.sort(candidates);
		if(candidates[0]>target)return result;
		getConbination(result,item,0,candidates,target);
		return result;
	}

	private void getConbination(List<List<Integer>> result, List<Integer> item, int start, int[] candidates, int target) {
		if(target<0)return;
		if(target==0)
		{
			List<Integer> temp=new ArrayList<Integer>(item);
			result.add(temp);
			return;
		}
		for(int i=start;i<candidates.length;i++)
		{
			if(target<candidates[i])break;
			item.add(candidates[i]);
			getConbination(result, item, i, candidates, target-candidates[i]);
			item.remove(item.size()-1);
		}
	}

}
