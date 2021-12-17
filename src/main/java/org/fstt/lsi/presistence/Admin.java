package org.fstt.lsi.presistence;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin extends Internaute{
	private String email;

	public Admin(Long id, String nom, String prenom, String password, String email) {
		super(id, nom, prenom, password);
		this.email = email;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
