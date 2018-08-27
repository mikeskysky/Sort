package com.mike.sort.leecode;


public class _38CountAndSay {
	public static void main(String[] args) {
		_38CountAndSay ca=new _38CountAndSay();
		System.out.println(ca.countAndSay(4));
	}
	public String countAndSay(int n) {
		String result=new String("1");
		int count=1;
		for(int i=2;i<=n;i++)
		{
			String charactcount="";
			char[] cs = result.toCharArray();
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<cs.length;j++)
			{
				charactcount=String.valueOf(cs[j]);
				if(j+1<cs.length&&cs[j+1]==cs[j])
				{
					count++;
				}
				else
				{
					sb.append(count+charactcount);
					count=1;
				}
			}
			result=sb.toString();
		}
		return result;
	}
}
