package com.orderzeros;

public class OrderZeros {
	public static void main(String args[]) {
		int[] array1 = new int[10];
		array1[0] = 0;
		array1[1] = 0;
		array1[2] = 2;
		array1[3] = 0;
		array1[4] = 4;
		array1[5] = 5;
		array1[6] = 0;
		array1[7] = 3;
		array1[8] = 6;
		array1[9] = 0;
		int[] array2 = orderZeros(array1);
		printArray(array2);
	}

	public static int[] orderZeros(int[] array2) {
		int dup;
		for (int i = array2.length-1; i >= 0; i--) {
			if (array2[i] == 0) {
				for (int j = 0; j < i; j++) {
					if (array2[j] == 0)
						continue;
					else {
						dup = array2[i];
						array2[i] = array2[j];
						array2[j] = dup;
						break;
					}
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
