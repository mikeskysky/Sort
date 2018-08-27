package com.mike.sort.leecode;

public class _74MinDistance {
	public static void main(String[] args) {
		_74MinDistance md=new _74MinDistance();
		String word1="intention";
		String word2="execution";
		System.out.println(md.minDistance(word1, word2));
	}
	public int minDistance(String word1, String word2) {
		int m=word1.length();
		int n=word2.length();
		int[][] news=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			news[i][0]=i;
		}
		for(int i=0;i<=n;i++)
		{
			news[0][i]=i;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				news[i][j]=Math.min(news[i-1][j]+1,news[i][j-1]+1);
				int cost= word1.charAt(i-1)==word2.charAt(j-1)?0:1;
                news[i][j]=Math.min(news[i][j],news[i-1][j-1]+cost);
			}
		}
		return news[m][n];
	}
}
