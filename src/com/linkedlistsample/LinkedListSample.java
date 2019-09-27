package com.linkedlistsample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSample {
	public static void main(String args[]) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list2.add(2);
		list2.add(1);
		try {
			LinkedList<Integer> list3 = findSum1(list1, list2);
			printList(list3);
			LinkedList<Integer> list4 = findSum2(list1, list2);
			printList(list4);
			LinkedList<Integer> list5 = findSum3(list1, list2);
			printList(list5);
		} catch (Exception e) {
			System.out.println("no output");
		}
	}

	/*
	 * TC:0(n^2),SC:0(n^2) without using stacks fetching through the entire list all
	 * the time
	 */
	private static LinkedList<Integer> findSum1(LinkedList<Integer> list1, LinkedList<Integer> list2)
			throws NullPointerException {
		if (isEmpty(list1) || isEmpty(list2)) {
			throw new NullPointerException();
		} else {
			while (list1.size() != list2.size()) {
				if (list1.size() > list2.size())
					list2.addFirst(0);
				else
					list1.addFirst(0);
			}
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
	}

	/*
	 * TC:0(n),SC:0(n) using two stacks
	 */
	private static LinkedList<Integer> findSum2(LinkedList<Integer> list1, LinkedList<Integer> list2)
			throws NullPointerException {
		if (isEmpty(list1) || isEmpty(list2)) {
			throw new NullPointerException();
		} else {
			while (list1.size() != list2.size()) {
				if (list1.size() > list2.size())
					list2.addFirst(0);
				else
					list1.addFirst(0);
			}
			LinkedList<Integer> list3 = new LinkedList<>();
			Stack<Integer> stack1 = new Stack<Integer>();
			Stack<Integer> stack2 = new Stack<Integer>();
			for (int i = 0; i < list1.size(); i++) {

				stack1.push(list1.get(i));
			}
			for (int j = 0; j < list2.size(); j++) {
				stack2.push(list2.get(j));
			}
			int div = 0;
			for (int i = 1, j = 1; i <= list1.size() && j <= list2.size(); i++, j++) {
				int value1 = stack1.pop();
				int value2 = stack2.pop();
				list3.add((div + value1 + value2) % 10);
				div = ((div + value1 + value2) / 10);
			}
			if (div != 0) {
				list3.add(div);
			}
			return list3;
		}
	}

	/*
	 * TC:0(n),SC:0(n) using only one stack
	 */
	private static LinkedList<Integer> findSum3(LinkedList<Integer> list1, LinkedList<Integer> list2)
			throws NullPointerException {
		if (isEmpty(list1) || isEmpty(list2)) {
			throw new NullPointerException();
		} else {
			while (list1.size() != list2.size()) {
				if (list1.size() > list2.size())
					list2.addFirst(0);
				else
					list1.addFirst(0);
			}
			LinkedList<Integer> list3 = new LinkedList<>();
			LinkedList<Integer> list4 = new LinkedList<>();
			LinkedList<Integer> list5 = new LinkedList<>();
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < list1.size(); i++) {
				stack.push(list1.get(i));
			}
			for (int i = 0; i < list1.size(); i++) {
				list3.add(stack.pop());
			}
			for (int i = 0; i < list2.size(); i++) {
				stack.push(list2.get(i));
			}
			for (int i = 0; i < list2.size(); i++) {
				list4.add(stack.pop());
			}
			int div = 0;
			for (int i = 0, j = 0; i < list3.size() && j < list4.size(); i++, j++) {
				list5.add((div + list3.get(i) + list4.get(j)) % 10);
				div = ((div + list3.get(i) + list4.get(j)) / 10);
			}
			if (div != 0) {
				list5.add(div);
			}
			return list5;
		}
	}

	/* method to check list for null or empty */
	static boolean isEmpty(LinkedList<Integer> list) {
		if (list == null || list.size() == 0)
			return true;
		return false;
	}

	/* method to print a list */
	private static void printList(LinkedList<Integer> list3) {
		Iterator<Integer> iterator = list3.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();
	}
}
