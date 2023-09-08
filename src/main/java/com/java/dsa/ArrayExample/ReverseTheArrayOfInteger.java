package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class ReverseTheArrayOfInteger {
	
	static void getReverseArraymethod(int size , int [] arr) {
		System.out.println("The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("After Reverse of the array is ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example of The Reverse The Given Array ");
		System.out.println("Enter the Size of the array is ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The Element In The given Array ");
			arr[i] = sc.nextInt();
		}
		getReverseArraymethod(size, arr);
	}
}
