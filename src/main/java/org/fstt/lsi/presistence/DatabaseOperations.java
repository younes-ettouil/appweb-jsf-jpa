package org.fstt.lsi.presistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;




public class DatabaseOperations {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
						/*==================Client===============*/
	//CreateClient
	public static String creeClient(String nom, String prenom, String password, String email, String nTele) {
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}

		Client cl = new Client(0L,
				nom, prenom,password, email, 
				nTele, null);
		
		entityMgrObj.persist(cl);
		transactionObj.commit();
		return "listClient.xhtml?faces-redirect=true";
		
		
	}
	//getAllClient
	public static List<Client> getAllClient() {
		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Client e");
		List<Client> lList = queryObj.getResultList();
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
	}
	//UpdateClient
	
	//DeleteClient
						/*==================Produit===============*/
	//CreateProduit
	public static String creerProduit() {
		return null;
	}
	//getAllProduit
	public static List<Produit> ListProduit() {
		return null;
	}
	//UpdateProduit

	public static String updateClient(Produit prod) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String deleteClient(int idProd) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String creeProduct(String nomProd, double prixProd, long cat) {
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		
		Produit pr= new Produit(0l, nomProd, prixProd,null,null);
		
		entityMgrObj.persist(pr);
		transactionObj.commit();
		return "listClient.xhtml?faces-redirect=true";
		
	}
	public static List<Categorie> getCategories() {
		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Categorie e");
		List<Categorie> lList = queryObj.getResultList();
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
		
	}
	public static List<Produit> getProducts() {
		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Produit e");
		List<Produit> lList = queryObj.getResultList();
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
	}

	
	//DeleteProduit
						/*==================Panier===============*/
}
