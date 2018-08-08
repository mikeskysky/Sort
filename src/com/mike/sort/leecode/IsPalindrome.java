package com.mike.sort.leecode;

public class IsPalindrome {

	public static void main(String[] args) {
		IsPalindrome ip = new IsPalindrome();
		System.out.println(ip.isPalindrome("race a car"));
	}

	public boolean isPalindrome(String s) 
	{
		if(s==null||s.length()<=1)return true;
		char[] cs=s.toLowerCase().toCharArray();
		int start=0;
		int end=cs.length-1;
		while(start<=end)
		{
			if(IsChar(cs[start])&&IsChar(cs[end]))
			{
				if(cs[start]!=cs[end])return false;
				start++;
				end--;
			}
			else if(IsChar(cs[start])&&!IsChar(cs[end]))
			{
				end--;
			}
			else if(!IsChar(cs[start])&&IsChar(cs[end]))
			{
				start++;
			}
			else
			{
				start++;
				end--;
			}
		}
		return true;
	}

	private boolean IsChar(char s) {
		if ((s >= 'a' && s <= 'z') || (s >= '0' && s <= '9'))
			return true;
		return false;
	}

}
