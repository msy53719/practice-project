package com.practice.project.four;

public class Pig extends RoleDothings {

	public Pig(String roleName) {
		super(roleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleeping() {
		System.out.print(super.getRoleName() + "在睡觉");
	}

	@Override
	public void eating() {
		System.out.print(super.getRoleName() + "在进食");
	}

	@Override
	public void wroking() {
	}

}
