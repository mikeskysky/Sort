package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40CombinationSum2 {
	
	public static void main(String[] args) 
	{
		_40CombinationSum2 cs=new _40CombinationSum2();
		int[] candidates= {10,1,2,7,6,1,5};
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
			if(!result.contains(temp))
			{
				result.add(temp);
			}
			return;
		}
		for(int i=start;i<candidates.length;i++)
		{
			if(target<candidates[i])break;
			item.add(candidates[i]);
			getConbination(result, item, i+1, candidates, target-candidates[i]);
			item.remove(item.size()-1);
		}
	}

}
