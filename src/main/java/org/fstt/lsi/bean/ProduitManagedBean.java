package org.fstt.lsi.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.fstt.lsi.presistence.Categorie;
import org.fstt.lsi.presistence.Client;
import org.fstt.lsi.presistence.DatabaseOperations;
import org.fstt.lsi.presistence.Produit;

@ManagedBean(name = "ProduitManagedBean")
@RequestScoped
public class ProduitManagedBean {
	private Long idProd;
	private String nomProd;
	private double prixProd;
	private Categorie cat;
	private List<Client> listClient;

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

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
	
	public void ajouterProduct(ProduitManagedBean manged) {

		DatabaseOperations.creeProduct(manged.getNomProd(), manged.getPrixProd(), manged.getCat().getIdcat());

	}
	public List<Produit> getAllProd(){
		return DatabaseOperations.getProducts();
	}

}
