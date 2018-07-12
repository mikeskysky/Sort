package com.mike.sort.boradproblem;

/**
 * 棋盘问题，随意选一个点，用L形填充
 *
 */
public class ChessBoradProblem 
{
	private int[][] board;//棋盘
	private int specialRow;//特殊点横下标
	private int specialCol;//特殊点列下标
	private int size;//棋盘大小
	private int type=0;
	public ChessBoradProblem(int[][] board, int specialRow, int specialCol, int size) {
		super();
		this.board = board;
		this.specialRow = specialRow;
		this.specialCol = specialCol;
		this.size = size;
	}
	
}
