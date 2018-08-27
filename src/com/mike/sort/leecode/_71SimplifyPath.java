package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.List;

public class _71SimplifyPath {
	public static void main(String[] args) 
	{
		_71SimplifyPath sp=new _71SimplifyPath();
		System.out.println(sp.simplifyPath("/.."));
	}
	public String simplifyPath(String path) {
		if(path==null||path.length()<1)return "";
		String[] cs=path.split("/");
		List<String> list=new ArrayList<String>();
		for(int i=0;i<cs.length;i++)
		{
			String temp=cs[i];
			if(temp.equals(""))
			{
				continue;
			}
			else if(temp.equals("."))
			{
				continue;
			}
			else if(temp.equals(".."))
			{
				if(list.size()>0)
				{
					list.remove(list.size()-1);
				}
			}
			else
			{
				list.add("/"+temp);
			}
			
		}
		if(list.size()<1)return "/";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++)
		{
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
