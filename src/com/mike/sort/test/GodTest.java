package com.mike.sort.test;

/**
 * m和n的最大公约数=n和m%n的最大公约数
 * @author Administrator
 *
 */
public class GodTest 
{
	public static void main(String[] args) 
	{
		System.out.println(getMaxGYS(36,24));
	}
	
	public static int getMaxGYS(int m,int n)
	{
		if(n==0)return m;
		return getMaxGYS(n, m%n);
	}
}
