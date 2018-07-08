package com.mike.sort.hannuota;

public class HanNuoTa 
{
	public static void main(String[] args) 
	{
		hanNuoTa(3,'A','B','C');
	}
	
	public static void hanNuoTa(int num,char from,char mid,char to)
	{
		if(num==1)
		{
			System.out.println("盘子"+num+"从"+from+"移动到"+to);
		}
		else
		{
			hanNuoTa(num-1, from, to, mid);
			System.out.println("盘子"+num+"从"+from+"移动到"+to);
			hanNuoTa(num-1,mid,from,to);
		}
	}
}
