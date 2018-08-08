package com.mike.sort.test;

public class StaticClassTest 
{
	public void say(ParentT p)
	{
		System.out.println("p is run");
	}
	public void say(Child1 p)
	{
		System.out.println("Child1 is run");
	}
	public static void main(String[] args) 
	{
		ParentT p=new Child1();
		StaticClassTest st=new StaticClassTest();
		st.say(p);
	}
}
class ParentT
{
	public void say()
	{
		System.out.println("");
	}
}
class Child1 extends ParentT
{
	
}
