package Tops_Assignment;

import java.util.Scanner;

public class second_frequent_char {

	static final int no_of_char = 256;

	public static char getSecondMostFreq(String str) {
		int[] count = new int[no_of_char];

		for (int i = 0; i < str.length(); i++)
			(count[str.charAt(i)])++;

		int first = 0, second = 0;
		for (int i = 0; i < no_of_char; i++) {

			if (count[i] > count[first]) {
				second = first;
				first = i;
			}

			else if (count[i] >count[second] && count[i] != count[first])
				second = i;
		}

		return (char) second;

	}

	public static void main(String[] args) {

		String str = "aabuddcaadab";

		char res = getSecondMostFreq(str);
		System.out.println(res);
	}

}
