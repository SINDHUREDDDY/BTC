package com.btc.pkg;

public class prg13 {
	public static void test(int input1, int input2) {
		
		int sum = 0;
		for (int i = input1; i <= input2; i++) {

			boolean b = isPalindrome(i);
			if (b) {

				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

	private static boolean isPalindrome(int i) {
		int temp = i, rev = 0;
		do {
			int digit = i % 10;
			rev = rev * 10 + digit;
			i = i / 10;

		} while (i > 0);

		return rev == temp;
	}

}
