package com.practice.project.four;

public abstract class Role implements DoSomeThing {

	private String roleName;

	private String roleType;

	public Role(String roleName, String roleType) {
		this.roleName = roleName;
		this.roleType = roleType;
	}

	public void studyEnglish() {
		System.out.println(roleType +roleName + "学习英语");
	}
}
