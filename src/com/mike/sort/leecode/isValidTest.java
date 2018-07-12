package com.mike.sort.leecode;

import java.util.Stack;

public class isValidTest {
	
	public static void main(String[] args) {
		isValidTest vt=new isValidTest();
		System.out.println(vt.isValid("{}"));
	}
	public boolean isValid(String s) 
	{
		Stack<Character> stack=new Stack<Character>();
		for (Character c:s.toCharArray()) {
			if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='[')
			{
				stack.push(']');
			}
			else if(c=='(')
			{
				stack.push(')');
			}
			else if(stack.isEmpty()||stack.pop()!=c)
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
}
