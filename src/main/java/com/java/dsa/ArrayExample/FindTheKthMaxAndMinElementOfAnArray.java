package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class FindTheKthMaxAndMinElementOfAnArray {
	
//	Sorting The Data in Descending order To get The Maximum value 
	static void getSortDataOfKthMaximumvalueFromArray(int size , int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
//	Sorting The Data In Ascending Order to get the Kth Minimum value 
	static void getSortDataOfKthMinimumvalueFromArray(int size , int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	static void getKthMinimumvalueFromArray(int size , int[] arr) {
		getSortDataOfKthMinimumvalueFromArray(size, arr);
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
		System.out.println("After The Sorting The Kth MAxium value Of Given Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("ENter the Kth maximum value is ");
		int kthMaximumValue = sc.nextInt();
		System.out.println("The Kth Maximum value is : "+arr[kthMaximumValue]);
		System.out.println();
		getKthMinimumvalueFromArray(size, arr);
		System.out.println("After The Sorting The Kth Minimum value Of Given Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("The Kth Minimum Value from The Array is : ");
		int KthminimumValue = sc.nextInt();
		System.out.println("The Kth Minimum value Is : ="+arr[KthminimumValue]);
		
	}

}
