package com.mike.sort.leecode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
	
	public static void main(String[] args) 
	{
		FirstUniqChar fup=new FirstUniqChar();
		System.out.println(fup.firstUniqChar("leetcode"));
	}
	public int firstUniqChar(String s) {
		if(s==null||"".equals(s))return  -1;
		else
		{
			char[] cs=s.toCharArray();
			Map<Character,Integer> set=new HashMap<>();
			for(int i=0;i<cs.length;i++)
			{
				char temp=cs[i];
				if(set.containsKey(temp))
				{
					set.put(temp,set.get(temp)+1);
				}
				else
				{
					set.put(temp,1);
				}
			}
			int i;
			for(i=0;i<cs.length;i++)
			{
				char temp=cs[i];
				if(set.get(temp)==1)break;
			}
			return i==cs.length?-1:i;
		}
	}
}
