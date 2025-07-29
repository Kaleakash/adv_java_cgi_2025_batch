package com;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
	int num[]= {3,1,6,9,4,10,5,2};
	System.out.println("Before sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	Arrays.sort(num);
	System.out.println();
	System.out.println("After sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	System.out.println("");
	System.out.println("Search element "+Arrays.binarySearch(num, 3));
	System.out.println("Search element "+Arrays.binarySearch(num, 10));
	}

}
