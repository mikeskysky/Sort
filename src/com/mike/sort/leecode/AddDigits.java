package com.mike.sort.leecode;

public class AddDigits {
	public static void main(String[] args) 
	{
		AddDigits ad=new AddDigits();
		System.out.println(ad.addDigits(19));
	}
	public int addDigits(int num) {
		if(num<=9)return num;
		if(num%9==0)return 9;
		else
		{
			return num%9;
		}
	}
}
