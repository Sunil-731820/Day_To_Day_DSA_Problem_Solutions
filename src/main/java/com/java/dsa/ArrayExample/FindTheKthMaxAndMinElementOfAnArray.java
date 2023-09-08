package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class FindTheKthMaxAndMinElementOfAnArray {
	
//	Sorting The Data To get The Maximum value 
	
	static void getSortDataOfKthMaximumvalueFromArray(int size , int[] arr) {
		
	}
	static void getKthMaximumvalueFromArray(int size , int[] arr) {
		getSortDataOfKthMaximumvalueFromArray(size, arr);
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The FindTheKthMaxAndMinElementOfAnArray ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array : ");
			arr[i] = sc.nextInt();
		}
		getKthMaximumvalueFromArray(size, arr);
	}

}
