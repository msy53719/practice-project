package com.practice.project.four;

public abstract class Role implements DoSomeThing {

	private String role;

	private String balltype;

	public Role(String role, String balltype) {
		this.role = role;
		this.balltype = balltype;
	}

	public void studyEnglish() {
		System.out.println(role +balltype + "学习英语");
	}
}
