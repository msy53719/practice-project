package com.practice.project.four;

public class Robot extends RoleDothings{

	public Robot(String roleName) {
		super(roleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleeping() {		
	}

	@Override
	public void eating() {
		System.out.print(super.getRoleName() + "在充电");

		
	}

	@Override
	public void wroking() {
		System.out.print(super.getRoleName() + "在工作");
		
	}


}
