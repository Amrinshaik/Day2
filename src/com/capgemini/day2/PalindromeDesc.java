package com.capgemini.day2;

public class PalindromeDesc {
	public static String[] sorting(String[] words) {
		int count = 0;
		int k = 0;
		String b = "";
		String temp = "";
		String palindromes[] = new String[4];
		for (int i = 0; i < 10; i++) {
			int n = words[i].length();
			for (int j = n - 1; j >= 0; j--) {
				b = b + words[i].charAt(j);
			}
			if (words[i].equals(b)) {
				count++;
				palindromes[k] = words[i];
				k++;
			}
			b = "";
		}
		System.out.println("Total palindromes: " + count);
		for (int j = 0; j < count - 1; j++) {
			for (int i = 0; i < count - j - 1; i++) {
				int n = palindromes[i].length();
				int m = palindromes[i + 1].length();
				if (n < m) {
					temp = palindromes[i + 1];
					palindromes[i + 1] = palindromes[i];
					palindromes[i] = temp;

				}
			}
		}
		System.out.println("Palindromes in desc order are: ");
		for (int i = 0; i < count; i++) {
			int n = palindromes[i].length();
			System.out.println(palindromes[i] + " : " + n);
		}
		return palindromes;
	}
}