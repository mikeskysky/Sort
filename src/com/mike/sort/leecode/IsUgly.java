package com.mike.sort.leecode;

public class IsUgly {
	public static void main(String[] args) 
	{
		IsUgly iu=new IsUgly();
		System.out.println(iu.isUgly(15));
	}
	public boolean isUgly(int num) {
		if(num==0)return false;
		while(num%2==0)
		{
			num/=2;
		}
		while(num%3==0)
		{
			num/=3;
		}
		while(num%5==0)
		{
			num/=5;
		}
		if(num==1)
		{
			return true;
		}
		return false;
	}
}
