package com.practice.project.three;

public class Student {

	private static final double IS_PASS = 60.00;
	
	private String name;
	private double enScore;
	private double mathScore;
	private double chScore;
	
	public String getName() {
		return name;
	}

	public double getEnScore() {
		return enScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public double getChScore() {
		return chScore;
	}

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

	public void isPass() {
		if (enScore < IS_PASS) {
			System.out.println("英语不及格");
		}
		if (mathScore < IS_PASS) {
			System.out.println("数学不及格");
		}
		if (chScore < IS_PASS) {
			System.out.println("语文不及格");
		}
	}

	public static void main(String[] args) {
		Student st=new Student("name", 20, 78, 100);
		System.out.println(st.getAverage());
		st.isPass();

	}

}
