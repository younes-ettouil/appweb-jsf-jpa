package org.fstt.lsi.presistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProd;
	private String nomProd;
	private double prixProd;
	@ManyToOne
	@JoinColumn(name = "id_cat")
	private Categorie cat;
	
	@ManyToMany
	@JoinTable(name = "Panier_client", joinColumns = @JoinColumn(name = "idProd"),
    inverseJoinColumns = @JoinColumn(name = "idClient"))
	private List<Client> listClient;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(Long idProd, String nomProd, double prixProd,Categorie cat, List<Client> listClient) {
		super();
		this.idProd = idProd;
		this.nomProd = nomProd;
		this.prixProd = prixProd;
		this.cat=cat;
		this.listClient = listClient;
	}
	public Long getIdProd() {
		return idProd;
	}
	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public double getPrixProd() {
		return prixProd;
	}
	public void setPrixProd(double prixProd) {
		this.prixProd = prixProd;
	}
	public Categorie getcat() {
		return cat;
	}
	public void setcat(Categorie cat) {
		this.cat = cat;
	}
	public List<Client> getListClient() {
		return listClient;
	}
	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
	
	
}
