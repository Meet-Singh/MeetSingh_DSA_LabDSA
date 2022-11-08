package com.greatlearning.balanceBrackets;

import java.util.Stack;

public class ValidateBracketSequence {
	public boolean validateSequnce(String sequence) {
		Stack<Character> stack = new Stack<>();

		char c;
		for (int i = 0; i < sequence.length(); i++) {
			c = sequence.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			}

			if (stack.isEmpty()) {
				return false;
			}

			switch (c) {
			case '}':
				char popChar = stack.pop();
				if (popChar == '[' || popChar == '(') {
					return false;
				}
				break;

			case ']':
				char popChar1 = stack.pop();
				if (popChar1 == '{' || popChar1 == '(') {
					return false;
				}
				break;

			case ')':
				char popChar2 = stack.pop();
				if (popChar2 == '{' || popChar2 == '[') {
					return false;
				}
				break;
			}

		}
		return stack.isEmpty();
	}
}
