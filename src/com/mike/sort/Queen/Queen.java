package com.mike.sort.Queen;
/**
 * 八皇后问题
 * @author Administrator
 *
 */
public class Queen 
{
	public static final int MAXQUEEN=8;
	public static int[] cols=new int[MAXQUEEN];//皇后棋子摆放位置
	private static int num=0;
	public static void main(String[] args) {
		Queen queen=new Queen();
		queen.getCount(0);
	}
	
	/**
	 * 
	 * @param n 第n列的皇后
	 */
	public void getCount(int n)
	{
		boolean[] rows=new boolean[MAXQUEEN];
		for(int m=0;m<n;m++)
		{
			rows[cols[m]]=true;
			int d=n-m;//距离
			if(cols[m]-d>=0)
			{
				rows[cols[m]-d]=true;
			}
			if(cols[m]+d<=(MAXQUEEN-1))
			{
				rows[cols[m]+d]=true;
			}
		}
		for(int i=0;i<MAXQUEEN;i++)
		{
			if(rows[i])continue;
			cols[n]=i;
			if(n<MAXQUEEN-1)
			{
				getCount(n+1);
			}
			else
			{
				num++;
				//打印出
				showQueen();
			}
		}
	}

	private void showQueen() 
	{
		System.out.println("第"+num+"种方案");
		for(int i=0;i<MAXQUEEN;i++)
		{
			for(int j=0;j<MAXQUEEN;j++)
			{
				if(i == cols[j]){
					System.out.print("0 ");
				}else{
					System.out.print("+ ");
				}

			}
			System.out.println();
		}
	}
}
