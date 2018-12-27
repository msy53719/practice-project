package com.practice.project.two;

public class Course {

	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private static final double isPass=60.00;
	private String courseName;
	private double courseScore;
	private String courseTeacher;

//	public Course(String courseName, double courseScore, String courseTeacher) {
//		this.courseName = courseName;
//		this.courseScore = courseScore;
//		this.courseTeacher = courseTeacher;
//	};

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

	public Boolean isPass(double courseScore) {
		if ( courseScore >= isPass) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Course course=new Course();
		course.setCourseScore(60);
		course.isPass(course.getCourseScore());
		System.out.println(course.isPass(course.getCourseScore()));

	}

}
