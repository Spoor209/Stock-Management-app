package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commande_fournisseur")
public class CommandeFournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCmdFournisseur;
	
    private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	//One Commande Fournisseur have Many lignes de commandes fournisseurs 
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCmdFournisseur> lignesCommandesFournisseurs;
	
	// Many CommandeFournisseur for one Fournisseur
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur; 
	
	

	public Long getIdCmdFournisseur() {
		return idCmdFournisseur;
	}

	public void setIdCmdFournisseur(Long idCmdFournisseur) {
		this.idCmdFournisseur = idCmdFournisseur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<LigneCmdFournisseur> getLignesCommandesFournisseurs() {
		return lignesCommandesFournisseurs;
	}

	public void setLignesCommandesFournisseurs(List<LigneCmdFournisseur> lignesCommandesFournisseurs) {
		this.lignesCommandesFournisseurs = lignesCommandesFournisseurs;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	
	
	
	
	
	

}
