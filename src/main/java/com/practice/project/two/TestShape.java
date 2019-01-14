package com.practice.project.two;

import org.junit.Test;

public class TestShape {

	@Test
	public void test(){
		Circle cr=new Circle(1);
		System.out.println(cr.getArea());
		System.out.println(cr.getRadius());
		Rectangle rc=new Rectangle(3, 4);
		System.out.println(rc.getArea());
		System.out.println(rc.getLength());
		System.out.println(rc.getWidth());
	}
	public static void main(String[] args) {
		Circle cr=new Circle(1);
		System.out.println(cr.getArea());
		System.out.println(cr.getRadius());
		Rectangle rc=new Rectangle(3, 4);
		System.out.println(rc.getArea());
		System.out.println(rc.getLength());
		System.out.println(rc.getWidth());

	}

}
