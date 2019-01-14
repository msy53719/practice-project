package com.practice.project.four;

public abstract class RoleDothings implements DoThings {

	public String roleName;

	public RoleDothings(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public abstract void sleeping();

	public abstract void eating();

	public abstract void wroking();

	
	public void Dotings(String roleName){
		switch (roleName) {
		case "人":
			this.eating();
			break;

		default:
			break;
		}
	}
}
