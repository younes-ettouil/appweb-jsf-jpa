package org.fstt.lsi.presistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Client")
public class Client extends Internaute{
private String email;
private String nTele;



@ManyToMany(mappedBy = "ListClient")
private List<Produit> listProduit ;


public Client() {
	super();
	// TODO Auto-generated constructor stub
}


public Client(Long id, String nom, String prenom, String password) {
	super(id, nom, prenom, password);
	// TODO Auto-generated constructor stub
}


public Client(Long id, String nom, String prenom, String password, String email, String nTele,
		List<Produit> listProduit) {
	super(id, nom, prenom, password);
	this.email = email;
	this.nTele = nTele;
	this.listProduit = listProduit;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getnTele() {
	return nTele;
}


public void setnTele(String nTele) {
	this.nTele = nTele;
}


public List<Produit> getListProduit() {
	return listProduit;
}


public void setListProduit(List<Produit> listProduit) {
	this.listProduit = listProduit;
}




}
