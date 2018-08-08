package com.mike.sort.leecode;

public class CoinsChange {
	public int SIZE=6;
	public int[] money= {100,50,20,10,5,1};
	
	public int lessChangeGiven(int input) 
	{
		if (input <= 0) {
			return 0;
		}
		int i;
		int best;
		int times = 0;

		if (input >= 100) {
			times = input / 100;
			input -= (times * 100);
		}
		if (input == 0) {
			return times;
		}
		for (i = 1; i < SIZE; ++i) {
			if (money[i] <= input && money[i - 1] > input) {
				break;
			}
		}

		int method1 = input - money[i];
		int method2 = money[i - 1] - input;

		best = method1 >= method2 ? method2 : method1;
		++times;

		if (best != 0) {
			times += lessChangeGiven(best);
		}

		return times;
	}

	public static void main(String[] args) {
		CoinsChange cc=new CoinsChange();
		System.out.println(cc.lessChangeGiven(32));
	}
}
