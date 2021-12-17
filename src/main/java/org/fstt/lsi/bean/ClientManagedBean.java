package org.fstt.lsi.bean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.fstt.lsi.presistence.Client;
import org.fstt.lsi.presistence.DatabaseOperations;
import org.fstt.lsi.presistence.Produit;

@ManagedBean(name = "ClientManagedBean")
@RequestScoped
public class ClientManagedBean {
	private Long id;
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private String nTele;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public void ajouterClient(ClientManagedBean manged) {

		DatabaseOperations.creeClient(manged.getNom(), manged.getPrenom(), manged.getPassword(), manged.getEmail(),
				manged.getnTele());

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Client> getAllClients() {

		return DatabaseOperations.getAllClient();
	}
	public String updateClient(ClientManagedBean bean) throws IOException {
		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

		/*
		 * Produit prod = new Produit(Integer.parseInt(params.get("idProd")), bean.nom,
		 * bean.prenom, bean.email, bean.nTele,);
		 */
		/* return DatabaseOperations.updateClient(prod); */
		return null;
	}
	

	public String deleteClient(int idProd) {
		return DatabaseOperations.deleteClient(idProd);
	}
	
}
