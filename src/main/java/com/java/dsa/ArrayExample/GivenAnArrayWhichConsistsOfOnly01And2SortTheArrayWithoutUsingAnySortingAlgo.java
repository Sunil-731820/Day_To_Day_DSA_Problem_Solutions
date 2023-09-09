package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class GivenAnArrayWhichConsistsOfOnly01And2SortTheArrayWithoutUsingAnySortingAlgo {
	
	static void getArrayAndDataShouldBeZeroOrOneSortingMethod(int size , int[] arr) {
		System.out.println("Starting The This Method :"+size);
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
	public static void main(String[] args) {
		System.out.println("This is The Example Of Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The Element In the Array is : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The given Arrray is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("callinG The Method called as getArray");
		getArrayAndDataShouldBeZeroOrOneSortingMethod(size, arr);
		System.out.println("After Sorting The Data is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
