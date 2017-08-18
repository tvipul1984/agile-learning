package com.jp.learn_agile.palindrome;

public class Palindrome {
	public static boolean isPalindrome(String input) {
		if(input == null) {
			throw new NullPointerException();
		}
		return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
	}
}
