package com.duplicatesSample;

public class DuplicatesSample {

	public static void main(String args[]) {
		char[] array1 = new char[10];
		array1[0] = 'c';
		array1[1] = 'a';
		array1[2] = 'b';
		array1[3] = 'c';
		array1[4] = 'a';
		array1[5] = 'e';
		array1[6] = 'e';
		array1[7] = 'a';
		array1[8] = 'e';
		array1[9] = 'd';
		char[] array2 = findDuplicates(array1);
		printDuplcates(array2);
	}
//finding duplicates
	public static char[] findDuplicates(char[] array3) {
		char[] array2 = new char[10];
		for (int i = 0; i < array3.length; i++) {
			for (int j = i + 1; j < array3.length; j++) {
				if (array3[i] == array3[j]) {
					array3[j] = '\0';
					array2[i] = array3[i];

				}
			}
		}
		return array2;
	}
//printing duplicates
	public static void printDuplcates(char[] array2) {
		for (Character element : array2) {
			if (element == '\0') {
				// do nothing
			} else {
				System.out.println(element);
			}
		}
	}
}
