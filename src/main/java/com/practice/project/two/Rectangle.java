package com.practice.project.two;

public class Rectangle extends Shape {

	private double l;
	private double w;

	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}

	public double getWidth() {
		return w;
	}

	public double getLength() {
		return l;
	}

	@Override
	public double getArea() {
		return l * w;
	}
}
