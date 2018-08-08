package com.mike.sort.test;

public class MeetTest 
{
	public String str;
	public MeetTest(String str) {
		super();
		this.str = str;
	}

	public static void main(String[] args) 
	{
		MeetTest mt=new MeetTest("hello");
		mt.change(mt);
		System.out.println(mt.str);
	}
	
	public void change(MeetTest mt)
	{
		mt=new MeetTest("change");
	}
}
