package com.mike.sort;



public class LCS
{
	public static void main(String[] args) 
	{
		LCS ls=new LCS();
		int[][] is = ls.lcs("abcd","aab");
		ls.show(is);
	}
	
	public void show(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] lcs(String str1,String str2)
	{
		int m=str1.length();
		int n=str2.length();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int[][] news=new int[m][n];
		for(int i=0;i<m;i++)
		{
			if(arr2[0]==arr1[i])
			{
				news[0][i]=1;
				for(int j=i+1;j<n;j++)
				{
					news[0][j]=1;
				}
				break;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr1[0]==arr2[i])
			{
				news[i][0]=1;
				for(int j=i+1;j<m;j++)
				{
					news[j][0]=1;
				}
				break;
			}
		}
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(arr1[i]==arr2[j])
				{
					news[i][j]=news[i-1][j-1]+1;
				}
				else
				{
					news[i][j]=Math.max(news[i][j-1],news[i-1][j]);
				}
			}
		}
		return news;
	}
}
