package com.searchText;

public class SearchText {
	public static void main(String args[]) {
		String text = "aaaaabcaaaabcaaaabca";//new String("complete  the work fastly com and completely");
		String search =  "aaaabca";//new String("comp");
		int l1 = text.length();
		int l2 = search.length();
		char[] array1 = new char[l1];
		char[] array2 = new char[l2];
		text.getChars(0, l1, array1, 0);
		search.getChars(0, l2, array2, 0);
		int i = 0;
		int j = 0;
		int k=0;
		while (i < array1.length&&j<array2.length) {
			if (array2[j] == array1[i]) {
				i++;
				j++;
			}
			else {
				j=0;
				i=k++;
			}
			if (j == array2.length) {
				System.out.println("element found at:" + (i - j));
				j = 0;
			}
			
		}
	}
}
