package com.duplicatessample;
public class DuplicatesSample2 {
	public static void main(String args[]) {
		char[] array1 = new char[10];
		array1[0] = 'a';
		array1[1] = 'b';
		array1[2] = 'c';
		array1[3] = 'a';
		array1[4] = 'd';
		array1[5] = 'b';
		array1[6] = 'e';
		array1[7] = 'd';
		array1[8] = 'r';
		array1[9] = 'r';
		findRepeat(array1);
	}

	public static void findRepeat(char[] array1) {
		int dupValue = 0;
		for (int l = 0; l < array1.length; l++) {
			int i = array1[l] - 97;
			int j = 1 << i;
			if ((j&dupValue)==0) {
				dupValue = (j | dupValue);
			} else
				System.out.println(array1[l]);
		}
	}
}
