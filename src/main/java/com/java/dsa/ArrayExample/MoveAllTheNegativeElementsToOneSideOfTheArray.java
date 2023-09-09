package com.java.dsa.ArrayExample;

import java.util.Scanner;

public class MoveAllTheNegativeElementsToOneSideOfTheArray {
	static void getMoveAllNegativeElementsInOneSideOfTheArray(int size , int[] arr) {
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
		System.out.println("Thiss is the Example Of Move all the negative elements to one side of the array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array ");
			arr[i] = sc.nextInt();
		}
		getMoveAllNegativeElementsInOneSideOfTheArray(size, arr);
		System.out.println("After movinng The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
