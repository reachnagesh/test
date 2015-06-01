package com.ccs.ws;

public class Test{

	public String toString() {
		return "Hello! My Name is : " + this.getClass() + " and the time is : " + new java.util.Date();
	}
	
	
	public static void main(String[] args) {
		String lineSeparator = System.getProperty("line.separator");
		
		System.out.print("Hello" + lineSeparator + " Hello!");
		
	}
}