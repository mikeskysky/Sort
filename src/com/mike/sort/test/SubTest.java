package com.mike.sort.test;

public class SubTest 
{
	public static void main(String[] args) {
		System.out.println(Parent.Sub.A);
	}
}
class Parent
{
	public static int A=1;
	static {
		A=2;
	}
	static class Sub extends Parent
	{
		public static int B=A;
	}
}
