package com.stock.mvc.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligne_vente")
public class LigneVente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	
	//Many LigneVente for One article
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	//Many LigneVente for One vente
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	
	

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
	
	
	
	

}
