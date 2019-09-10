package com.duplicatessample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		Set<Integer> finalSet = findRepeat(array1);
		printSet(finalSet);
	}

	private static Set<Integer> findRepeat(int[] array1) {
		Set<Integer> dupset = new HashSet<>();
		for (int i = 0; i < array1.length; i++) {
			dupset.add(array1[i]);
		}
		return dupset;
	}

	private static void printSet(Set<Integer> finalSet) {
		Iterator<Integer> iterator = finalSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
