package org.fstt.lsi.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.fstt.lsi.presistence.Categorie;
import org.fstt.lsi.presistence.Client;
import org.fstt.lsi.presistence.DatabaseOperations;
import org.fstt.lsi.presistence.Produit;

@ManagedBean(name = "CatMangedBean")
@RequestScoped
public class CatMangedBean {
	private int idcat;
	private String nomcat;
	
	private List<Produit> listProd;
	
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
	public List<Produit> getListProd() {
		return listProd;
	}
	public void setListProd(List<Produit> listProd) {
		this.listProd = listProd;
	}

	public List<Categorie> getCategories() {

		return DatabaseOperations.getCategories();
	}
	
	
	

}
