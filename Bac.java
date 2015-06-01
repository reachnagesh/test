/**
 * 
 */
package com.opt.assignment1;

import java.util.*;


/**
 * @author abhiram
 *
 */
public class Bac {
	static Scanner in=new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {



	System.out.println("enter the standard drinks consumed=");
	int d=in.nextInt();

	System.out.println("person's weight(pounds)=");
	int w=in.nextInt();

	System.out.println("number of hours since the first drink=");
	int h=in.nextInt();
	System.out.println("person's age=");
	int e=in.nextInt();

	System.out.println("enter r(if male r=0.73,female r=0.66)=");
	float r=in.nextFloat();
	
	

	
 double AM,BAC;
 
 AM=0.015*h;
BAC=((3.701*d)/(w*r))-(AM);
//System.out.println("blood alcohol content"+BAC);
if (e>=21 && BAC>0.08)
{
	System.out.println("alcohal consumed");
}
else if(e<21 && BAC>0.02 ){
	System.out.println("alcohal consumed");
}
else
{
	System.out.println("alcohal not consumed");}
}

	
	
	
	}


