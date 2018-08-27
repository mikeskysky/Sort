package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring {
	
	public static void main(String[] args) 
	{
		FindSubstring fs=new FindSubstring();
		String s="a";
		String[] words= {"a"};
		System.out.println(fs.findSubstring(s, words));
	}
	public List<Integer> findSubstring(String s, String[] words) 
	{
		if(s.length()==0||words==null||words.length==0)return new ArrayList<Integer>();
		int size=words[0].length();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			Map<String,Integer> map=new HashMap<String,Integer>();
			for(int j=0;j<words.length;j++)
			{
				String temp=words[j];
				if(map.containsKey(temp))
				{
					map.put(temp, map.get(temp)+1);
				}
				else
				{
					map.put(temp,1);
				}
			}
			if(checkContain(s,i,map,size))list.add(i);
		}
		return list;
	}
	private boolean checkContain(String s, int i, Map<String, Integer> map, int size) {
		if(map.size()==0)return true;
		if(i>s.length()||i+size>s.length())return false;
		String temp=s.substring(i, i+size);
		if(map.containsKey(temp))
		{
			map.put(temp, map.get(temp)-1);
			if(map.get(temp)==0)map.remove(temp);
			return checkContain(s, i+size, map, size);
		}
		return false;
	}
}
