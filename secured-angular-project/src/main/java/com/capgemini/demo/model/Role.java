package com.capgemini.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int roleId;

	@Column(name = "role")
	private String role;

	public Role() {
	}
	
	public String getRole() {
		return role;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
