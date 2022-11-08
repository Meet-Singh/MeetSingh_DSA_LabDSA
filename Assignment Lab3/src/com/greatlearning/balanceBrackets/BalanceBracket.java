package com.greatlearning.balanceBrackets;

import java.util.Scanner;

public class BalanceBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bracketInput = sc.next();

		ValidateBracketSequence vbs = new ValidateBracketSequence();
		boolean isBracketSequenceValid = vbs.validateSequnce(bracketInput);

		if (isBracketSequenceValid) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
		sc.close();

	}

}
