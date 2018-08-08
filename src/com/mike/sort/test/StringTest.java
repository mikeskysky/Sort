package com.mike.sort.test;

public class StringTest
{
	public static void main(String[] args) 
	{
		StringTest st=new StringTest();
		String str=new String("str");
		String str1="str";
		System.out.println(str.intern()==str1);
	}
	
	public void change(String str)
	{
		str="change";
	}
}
