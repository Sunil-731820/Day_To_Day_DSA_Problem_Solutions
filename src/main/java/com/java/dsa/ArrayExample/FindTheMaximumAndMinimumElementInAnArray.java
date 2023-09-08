package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class FindTheMaximumAndMinimumElementInAnArray {
	
//	Sorting The Data To get The Maximum value 
	static void getSortingTheDatainDescOrder(int size , int[] arr) {
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
	
//	Sorting The Data To get The Minimum Value 
	static void getSortingTheDataInAscendOrder(int size,int[] arr) {
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
	
	static void getMaximumValueFromArray(int size , int[] arr) {
		getSortingTheDatainDescOrder(size, arr);
		System.out.println("The maximum value is : ="+arr[0]);
	}
	
	static void getMinimumvalueFromArray(int size , int[] arr) {
		getSortingTheDataInAscendOrder(size, arr);
		System.out.println("The Minimum value is : "+arr[0]);
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Find the maximum and minimum element in an array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element One By One ");
			arr[i] = sc.nextInt();
		}
		System.out.println("callinG The Maximum value is : ");
		getMaximumValueFromArray(size, arr);
		System.out.println("calling The Minimum value is : ");
		getMinimumvalueFromArray(size, arr);
	}

}
