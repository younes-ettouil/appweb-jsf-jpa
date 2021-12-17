package org.fstt.lsi.presistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcat;
	private String nomcat;
	
	@OneToMany
	@JoinColumn(name = "id_cat")
	private List<Produit> listProd;
	
	public Categorie(int idcat, String nomcat) {
		super();
		this.idcat = idcat;
		this.nomcat = nomcat;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	
}
