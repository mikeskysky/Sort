package com.mike.sort.test;

class Test {
	private static Test singleTon = new Test();
	public static int count1;
	public static int count2 = 0;

	public Test() {
		System.out.println("test");
		count1++;
		count2++;
	}

	public static Test getInstance() {
		return singleTon;
	}
}

public class SingleTon {
	public static void main(String[] args) {
		Test singleTon=new Test();
//		Test singleTon = Test.getInstance();
		System.out.println("count1=" + singleTon.count1);
		System.out.println("count2=" + singleTon.count2);
	}
}
