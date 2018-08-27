package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	
	public static void main(String[] args) 
	{
		GenerateParenthesis cp=new GenerateParenthesis();
		System.out.println(cp.generateParenthesis(3));
	}
	public List<String> generateParenthesis(int n) {
		List<String> list=new ArrayList<String>();
		getGenerateParenthesis(list,"",n,0,0);
		return list;
	}

	private void getGenerateParenthesis(List<String> list,String cur, int n, int left, int right) 
	{
		if(cur.length()==n*2)
		{
			list.add(cur);
			return;
		}
		if(left<n)
		{
			getGenerateParenthesis(list, cur+"(", n, left+1, right);
		}
		if(right<left)
		{
			getGenerateParenthesis(list, cur+")", n, left, right+1);
		}
	}
}
