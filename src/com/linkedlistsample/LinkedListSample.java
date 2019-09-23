package com.linkedlistsample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {
	public static void main(String args[]) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(3);
		list1.add(4);
		list1.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(5);
		LinkedList<Integer> list3 = findSum(list1, list2);
		printList(list3);
	}

	private static LinkedList<Integer> findSum(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		int div = 0;
		LinkedList<Integer> list3 = new LinkedList<>();
		for (int i = list1.size(), j = list2.size(); i >= 1 || j >= 1; i--, j--) {
			list3.add((div + list1.get(i - 1) + list2.get(j - 1)) % 10);
			div = (div + list1.get(i - 1) + list2.get(j - 1)) / 10;
		}
		if (div != 0) {
			list3.add(div);
		}
		return list3;
	}

	private static void printList(LinkedList<Integer> list3) {
		Iterator<Integer> iterator = list3.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
