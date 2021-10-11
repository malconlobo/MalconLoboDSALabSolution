package com.greatlearning.main;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String string = sc.next();

		if (checkBalance(string)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		sc.close();
	}

	public static boolean checkBalance(String string) {

		Stack<Character> stack = new Stack<>();

		if (string.length() % 2 == 1) {
			return false;
		}

		for (int i = 0; i < string.length(); i++) {
			char bracket = string.charAt(i);
			if (bracket == '[' || bracket == '{' || bracket == '(') {
				stack.push(bracket);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					switch (bracket) {
					case ')':
						if (stack.pop() != '(') {
							return false;
						}
						break;

					case ']':
						if (stack.pop() != '[') {
							return false;
						}
						break;

					case '}':
						if (stack.pop() != '{') {
							return false;
						}
						break;
					}
				}
			}
		}

		return true;
	}

}
