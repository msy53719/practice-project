package com.practice.project.five;

public class Qwert {

	private final static String VAL_ONE = "cccAPP_1.0-0";
	private final static String VAL_TWO = "cccAPP_1.0-";

	public static String getChar(int i) {
		if (i >= 0 && i < 10) {
			return VAL_ONE + String.valueOf(i);
		} else if (i >= 10) {
			return VAL_TWO + String.valueOf(i);
		} else {
			return "输入错误";
		}

	}

	public static void main(String[] args) {
		System.out.println(getChar(50));
	}
}
