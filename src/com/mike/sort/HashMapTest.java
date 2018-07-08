package com.mike.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest 
{
	public static void main(String[] args) 
	{
		Map<String,Object> map=new HashMap<String,Object>();
		List<ArrayList> list=new ArrayList<ArrayList>();
		ArrayList innList=new ArrayList();
		innList.add("test");
		list.add(innList);
		map.put("test1",list);
		innList.add("test2");
		System.out.println(map.get("test1"));
	}
}
