package com.practice.project.three;

public class Student {

	private static final double IS_PASS = 60.00;
	private String name;
	private double enScore;
	private double mathScore;
	private double chScore;

	public Student(String name, double enScore, double mathScore, double chScore) {

		this.name = name;
		this.enScore = enScore;
		this.mathScore = mathScore;
		this.chScore = chScore;
	}

	public double getAverage() {// double enScore,double mathScore,double chScore
		double sum = enScore + mathScore + chScore;
		double average = sum / 3.00;
		return average;
	}

	public void isPass(double score) {
		if (score<IS_PASS) {

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
