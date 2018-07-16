package com.capgemini.demo.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "name")
	private String name;

	@Column(name = "active")
	private int active;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public Users() {
	}

	public Users(Users users) {
		this.active = users.getActive();
		this.email = users.getEmail();
		this.roles = users.getRoles();
		this.name = users.getName();
		this.lastName = users.getLastName();
		this.id = users.getId();
		this.password = users.getPassword();
	}

	public int getActive() {
		return active;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return null;
	}

	public String getPassword() {
		return password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
