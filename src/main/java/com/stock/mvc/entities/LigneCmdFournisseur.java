package com.stock.mvc.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligne_commande_fournisseur")
public class LigneCmdFournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idLigneCmdFournisseur;
	
	//Many LigneCmdFournisseur for One article
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
		
	//Many LigneCmdFournisseur for One CommandeFournisseur
	@ManyToOne
	@JoinColumn(name="idCmdFournisseur")
	private CommandeFournisseur commandeFournisseur;

	
	public Long getIdLigneCmdFournisseur() {
		return idLigneCmdFournisseur;
	}

	public void setIdLigneCmdFournisseur(Long idLigneCmdFournisseur) {
		this.idLigneCmdFournisseur = idLigneCmdFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
	

	
	
	
	
	

}
