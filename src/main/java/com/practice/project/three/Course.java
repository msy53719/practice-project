package com.practice.project.three;

public class Course {

	private static final double IS_PASS = 60.00;
	private static final double MIN_SOCRE = 0.00;
	private static final double MAX_SOCRE = 100.00;
	private String courseName;
	private double courseScore;
	private String courseTeacher;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseScore() {
		return courseScore;
	}

	public void setCourseScore(double courseScore) {
		this.courseScore = courseScore;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public String isPass(double courseScore) {
		if (MAX_SOCRE >= courseScore && courseScore >= IS_PASS) {
			return "及格";
		} else if (IS_PASS>= courseScore && courseScore >=MIN_SOCRE) {
			return "不及格";
		}else{
			return "成绩输入错误";
		}
	}

	public static void main(String[] args) {
		Course course = new Course();
		course.setCourseScore(0);
		course.isPass(course.getCourseScore());
		System.out.println(course.isPass(course.getCourseScore()));

	}

}
