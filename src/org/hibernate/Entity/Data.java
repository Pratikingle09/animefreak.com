package org.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="login_credentials")
@Table(name="login_credentials")
public class Data {
	
	@Column(name="username")
	String username;
	
	@Id
	@Column(name="password")
	String password;

	public Data(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Data() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
