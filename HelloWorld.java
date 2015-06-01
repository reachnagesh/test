//package com.ccs.module1;

public class HelloWorld {
	
	int i;
	
	public HelloWorld(int num) {
		i = num;
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld(10);
		for (int k=0; k<hw.i; k++) {
			System.out.println("Hello World!");
		}
	}
}


