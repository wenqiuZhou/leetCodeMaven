package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;

public class BinaryAdd {
	public String addBinary(String a, String b) {

		ArrayList<Character> resultList = new ArrayList<Character>();
		int lenA = a.length();
		int lenB = b.length();
		char aLast = '0', bLast = '0';
		char result = '0';
		while (lenA > 0 || lenB > 0) {
			if (--lenA >= 0) {
				aLast = a.charAt(lenA);
			}
			if (--lenB >= 0) {
				bLast = b.charAt(lenB);
			}
			if (aLast == '1' && bLast == '1') {
				resultList.add(result);
				result = '1';
			} else if (aLast == '0' && bLast == '0') {

				resultList.add(result);
				result = '0';
			} else {
				if (result == '1') {
					resultList.add('0');
					result = '1';
				} else {

					resultList.add('1');

					result = '0';

				}
			}
			aLast = '0';
			bLast = '0';
		}
		StringBuilder rb = new StringBuilder();
		for (char c : resultList) {
			rb.append(c);
		}
		if (result == '1') {
			rb.append(result);
		}
		System.out.println(rb.reverse().toString());
		return rb.toString();
	}
}
