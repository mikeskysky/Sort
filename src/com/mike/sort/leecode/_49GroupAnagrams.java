package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49GroupAnagrams {
	
	public static void main(String[] args) {
		_49GroupAnagrams ga=new _49GroupAnagrams();
		String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ga.groupAnagrams(strs));
	}
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,String> map=new HashMap<String,String>();
		for(int i=0;i<strs.length;i++)
		{
			String temp=strs[i];
			char[] tempArr=temp.toCharArray();
			Arrays.sort(tempArr);
			String sortStr=String.valueOf(tempArr);
			if(map.containsKey(String.valueOf(tempArr)))
			{
				map.put(sortStr,map.get(sortStr)+","+i);
			}
			else
			{
				map.put(sortStr,i+"");
			}
		}
		List<List<String>> result=new ArrayList<List<String>>();
		for (Map.Entry<String,String> entry :map.entrySet()) {
			List<String> list=new ArrayList<String>();
			String values=entry.getValue();
			String[] split= values.split(",");
			for(int i=0;i<split.length;i++)
			{
				list.add(strs[Integer.parseInt(split[i])]);
			}
			result.add(list);
		}
		return result;
	}
}
