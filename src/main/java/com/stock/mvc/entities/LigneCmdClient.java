package com.stock.mvc.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligne_commande_client")
public class LigneCmdClient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idLigneCmdClient;
	
	//Many LigneCmdClient for One article
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	//Many LigneCmdClient for One CommandeClient
	@ManyToOne
	@JoinColumn(name="idCmdClient")
	private CommandeClient commandeClient;
	
	
	
	

	public Long getIdLigneCmdClient() {
		return idLigneCmdClient;
	}

	public void setIdLigneCmdClient(Long idLigneCmdClient) {
		this.idLigneCmdClient = idLigneCmdClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	

	

	
	
	
	
	

}
