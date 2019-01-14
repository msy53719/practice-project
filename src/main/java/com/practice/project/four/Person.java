package com.practice.project.four;

public class Person extends RoleDothings {

	public Person(String roleName) {
		super(roleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleeping() {
		System.out.print(super.getRoleName() + "在睡觉");

	}

	@Override
	public void eating() {
		System.out.print(super.getRoleName() + "在吃饭");

	}

	@Override
	public void wroking() {
		System.out.print(super.getRoleName() + "在工作");

	}

}
