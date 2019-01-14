package com.practice.project.two;

public class Circle extends Shape {

	private double r;
	private final double PI = 3.14;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}

	public double getRadius() {
		return r;
	}

}
