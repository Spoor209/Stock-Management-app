package com.stock.mvc.model;

import java.util.Collection;
import java.util.Map;

import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.LigneCmdClient;

public interface ModelCommandeClient {
	
    void creerCommande();
	
	void modifierCommande(Client client);
	
	LigneCmdClient ajouterLigneCommande(Article article);
	
	LigneCmdClient supprimerLigneCommande(Article article);
	
	LigneCmdClient modifierQuantite(Article article, double qte);
	
	String generateCodeCommande();
	
	CommandeClient getCommande();
	
	Map<Long, LigneCmdClient> getLigneCde();
	
	Collection<LigneCmdClient> getLignesCommandeClient(CommandeClient commande);
	
	void init();

}
