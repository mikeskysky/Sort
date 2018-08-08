package com.mike.sort.leecode;

import java.util.Stack;

public class MinStack {
	public Stack<Integer> stack;
	public Stack<Integer> minStack;
	
	public MinStack() {
		this.stack =new Stack<Integer>();
		this.minStack = new Stack<Integer>();
	}

	public static void main(String[] args) 
	{
		MinStack minStack = new MinStack();
		minStack.push(0);
		minStack.push(1);
		minStack.push(0);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin()); 
	}
	
	public void push(int x) 
	{
		stack.push(x);
		if(minStack.isEmpty())
		{
			minStack.push(x);
		}
		else
		{
			Integer temp=minStack.peek();
			if(temp>=x)
			{
				minStack.push(x);
			}
		}
	}

	public void pop() {
		int pop=stack.pop();
		if(pop==minStack.peek())
		{
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
