package com.mike.sort.leecode;

public class _64minPathSum {
	
	public static void main(String[] args) {
		_64minPathSum ms=new _64minPathSum();
		int[][] grid= {{1,3,1},
				  {1,5,1},
				  {4,2,1}};
		System.out.println(ms.minPathSum(grid));
	}
	public int minPathSum(int[][] grid) {
		if(grid==null||grid.length<1)return -1;
		int m=grid.length;
		int n=grid[0].length;
		int[][] news=new int[m][n];
		news[0][0] = grid[0][0];
		for(int i=1;i<m;i++)
		{
			news[i][0]=grid[i][0]+news[i-1][0];
		}
		for(int i=1;i<n;i++)
		{
			news[0][i]=grid[0][i]+news[0][i-1];
		}
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				news[i][j]=grid[i][j]+Math.min(news[i-1][j],news[i][j-1]);
			}
		}
		return news[m-1][n-1];
	}
}
