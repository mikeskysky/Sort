package com.mike.sort.leecode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) 
	{
		Anagram am=new Anagram();
		System.out.println(am.isAnagram("anagram","nagaram"));
	}
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())return false;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] cs1=s.toCharArray();
		char[] cs2=t.toCharArray();
		for(int i=0;i<cs1.length;i++)
		{
			char temp=cs1[i];
			if(map.containsKey(temp))
			{
				map.put(temp,map.get(temp)+1);
			}
			else
			{
				map.put(temp,1);
			}
		}
		for(int i=0;i<cs2.length;i++)
		{
			char temp=cs2[i];
			if(map.containsKey(temp))
			{
				if(map.get(temp)==1)
				{
					map.remove(temp);
				}
				else
				{
					map.put(temp,map.get(temp)-1);
				}
			}
		}
		return map.size()==0;
	}
	
}
