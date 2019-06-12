package com.example.usingjava;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithArrays {

	static boolean areTheSame(int[] a, int[] b){
		List<Integer> notFound = new ArrayList<>();
		for (int i = 0; i<b.length; i++) {
			int currentNumber = b[i];
			System.out.println("Checking number: " + currentNumber);
			for (int s = 0; s < a.length; s++) {
				int n = a[s];
				int multiplied = n * n;
				if (currentNumber == multiplied) {
					System.out.println("Found that " +n + " square is equal to + current number");
					break;
				}
			}
		}
		return false;
	}
}
