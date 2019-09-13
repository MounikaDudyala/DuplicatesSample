package com.duplicatessample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		Set<Character> finalSet = findRepeat(array1);
		printRepeat(finalSet);
	}

	public static Set<Character> findRepeat(char[] array1) {
		Set<Character> dupset = new HashSet<>();
		int dupValue = 0;
		for (int l = 0; l < array1.length; l++) {
			int i = array1[l] - 97;
			int j = 1 << i;
			if ((j&dupValue)==0) {
				dupValue = (j | dupValue);
			} else
				dupset.add(array1[l]);
		}
		return dupset;
	}
	private static void printRepeat(Set<Character> finalSet) {
		Iterator<Character> iterator = finalSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
