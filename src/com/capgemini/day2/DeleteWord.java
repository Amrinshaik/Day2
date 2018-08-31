package com.capgemini.day2;

public class DeleteWord {

	public static String removeDuplicates(String inputString) {
		int i, j;
		String output = "";
		String word[] = inputString.split(" ");
		int x = word.length;

		for (i = 0; i < x; i++) {
			if (word[i] != null) {
				for (j = i + 1; j < x; j++) {
					if (word[i].equals(word[j])) {
						word[j] = null;
					}
				}
			}
		}
		for (int k = 0; k < x; k++) {
			if (word[k] != null)
				output = output+word[k] + " ";
		}

		return output;
	}
}
