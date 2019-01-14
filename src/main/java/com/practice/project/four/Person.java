package com.practice.project.four;

public class Person extends RoleDothings {

//	public Person(String roleName) {
//		super();
//	}

	@Override
	public void sleeping() {
		System.out.println(this.getRoleName() + "在睡觉");
	}
}
