package com.stock.mvc.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.LigneCmdClient;


@Component
public class ModelCommandeClientImpl implements ModelCommandeClient{
	
	private CommandeClient commande;
	private Map<Long, LigneCmdClient> ligneCde = new HashMap<Long, LigneCmdClient>();
	
	@Override
	public void init() {
		commande = null;
		ligneCde.clear();
		
	}

	@Override
	public void creerCommande() {
		commande = new CommandeClient();
		commande.setDateCommande(new Date());
		commande.setCode(generateCodeCommande());
	}
	
	@Override
	public void modifierCommande(Client client) {
		if (client == null) {
			return;
		}
		if (commande != null) {
			commande.setClient(client);
		}
	}

	@Override
	public LigneCmdClient ajouterLigneCommande(Article article) {
		
		if (article == null) {
			return null;
		}
		LigneCmdClient lc = ligneCde.get(article.getIdArticle());
		// Si ligne de commande existe
		if (lc != null) {
			BigDecimal qte = lc.getQuantite().add(BigDecimal.ONE);
			lc.setQuantite(qte);
			
			//put met à jour ce qui existe
			ligneCde.put(article.getIdArticle(),lc);
			return lc;
			
		} else {
			//On créer une nouvelle ligne de commande
			LigneCmdClient ligne = new LigneCmdClient();
			ligne.setCommandeClient(commande);
			ligne.setQuantite(BigDecimal.ONE);
			ligne.setPrixUnitaire(article.getPrixUnitaireTTC());
			ligne.setArticle(article);
			ligneCde.put(article.getIdArticle(), ligne);
			return ligne;
		}
	}

	@Override
	public LigneCmdClient supprimerLigneCommande(Article article) {
		if (article == null) {
			return null;
		}
		return ligneCde.remove(article.getIdArticle());
	}

	
	@Override
	public LigneCmdClient modifierQuantite(Article article, double qte) {
		if (article == null) {
			return null;
		}
		LigneCmdClient lc = ligneCde.get(article.getIdArticle());
		if (lc == null) {
			return null;
		}
		lc.setQuantite(BigDecimal.valueOf(qte));
		return lc;
	}
	
	
	@Override
	public Collection<LigneCmdClient> getLignesCommandeClient(CommandeClient commande) {
		for (LigneCmdClient ligneCdeClt : ligneCde.values()) {
			ligneCdeClt.setCommandeClient(commande);
		}
		return ligneCde.values();
	}

	@Override
	public String generateCodeCommande() {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase() ;
	}

	@Override
	public CommandeClient getCommande() {
		return commande;
	}

	public void setCommande(CommandeClient commande) {
		this.commande = commande;
	}

	@Override
	public Map<Long, LigneCmdClient> getLigneCde() {
		return ligneCde;
	}

	public void setLigneCde(Map<Long, LigneCmdClient> ligneCde) {
		this.ligneCde = ligneCde;
	}

}
