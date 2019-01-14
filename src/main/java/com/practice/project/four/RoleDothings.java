package com.practice.project.four;

public abstract class RoleDothings implements DoThings {

	private String roleName;

//	public RoleDothings(String roleName) {
//		this.setRoleName(roleName);
//	}

	public void sleeping() {
		System.out.println(getRoleName() + "在睡觉");
	}

	public void eating() {
		System.out.println(getRoleName() + "在吃饭");

	}

	public void wroking() {
		System.out.println(getRoleName() + "在工作");

	}

	public void feedding() {
		System.out.println(getRoleName() + "在进食");

	}

	public void chargeing() {
		System.out.println(getRoleName() + "在充电");

	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
