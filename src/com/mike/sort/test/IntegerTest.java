package com.mike.sort.test;

public class IntegerTest 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		Integer i3=100;
		System.out.println(i1==i2);
		System.out.println(i3==i2.intValue());
	}
}
