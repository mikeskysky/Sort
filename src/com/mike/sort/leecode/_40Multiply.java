package com.mike.sort.leecode;

public class _40Multiply {
	
	public static void main(String[] args) {
		_40Multiply mu=new _40Multiply();
		System.out.println(mu.multiply("5","12"));
	}
	
	public String multiply(String num1, String num2) {
		if(num1.equals("0")||num2.equals("0"))return "0";
		char[] cs1=num1.toCharArray();
		char[] cs2=num2.toCharArray();
		reverNum(cs1);
		reverNum(cs2);
		return getMultiply(cs1,cs2);
	}

	private String getMultiply(char[] cs1, char[] cs2) {
		int[] news=new int[cs1.length+cs2.length+3];
		for(int i=0;i<cs1.length;i++)
		{
			for(int j=0;j<cs2.length;j++)
			{
				news[i+j]+=Integer.parseInt(String.valueOf(cs1[i]))*Integer.parseInt(String.valueOf(cs2[j]));
			}
		}
		for(int i=0;i<news.length;i++)
		{
			if(news[i]>=10&&i+1<news.length)
			{
				int carry=news[i]/10;
				news[i+1]=news[i+1]+carry;
				news[i]=news[i]%10;
			}
		}
		int end;
		for(end=news.length-1;end>=0;end--)
		{
			if(news[end]>0)break;
		}
		StringBuilder sb=new StringBuilder();
		while(end>=0)
		{
			sb.append(news[end--]);
		}
		return sb.toString();
	}

	private void reverNum(char[] cs1) {
		for(int i=0;i<cs1.length/2;i++)
		{
			char temp=cs1[i];
			cs1[i]=cs1[cs1.length-1-i];
			cs1[cs1.length-1-i]=temp;
		}
	}
	
	
}
