package com.bz;

public class SampleException {

	public static void main(String[] args) {
		
	try {
		int a=15;
		int b=0;
		int c=a/b;
		System.out.println("result "+ c);
       } catch (ArithmeticException e) {
		System.out.println("cant divide by zero");
	
	}
	try {
		int num=Integer.parseInt("swati");
		System.out.println(num);
	} catch (NumberFormatException e) {
		System.out.println("number format Exception");
	}
	
	try {
	int a[]=new int[5];
	a[7]=9;
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array out of bounds index");
	
	}
	}
}