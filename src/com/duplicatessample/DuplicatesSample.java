package com.duplicatessample;

public class DuplicatesSample {
	public static void main(String args[]) {
		int[] array1 = new int[10];
		array1[0] = 6;
		array1[1] = 1;
		array1[2] = 2;
		array1[3] = 6;
		array1[4] = 1;
		array1[5] = 1;
		array1[6] = 6;
		array1[7] = 3;
		array1[8] = 4;
		array1[9] = 4;
		int[] array2 = findRepeat(array1);
		printArray(array2);
	}
	private static int[] findRepeat(int[] array1) {
		int[] array2 = new int[10];
		int count=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					array2[count]=array1[i];
					array1[j] = 0;
					count++;
				}
			}
		}
		return array2;
	}
	private static void printArray(int[] array2) {
		for (int element : array2) {
				System.out.println(element);
		}

	}
}
