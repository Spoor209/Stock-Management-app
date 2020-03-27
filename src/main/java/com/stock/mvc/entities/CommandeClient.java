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
@Table(name="commande_client")
public class CommandeClient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCmdClient;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	//One Commande Client have Many lignes de commandes 
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCmdClient> lignesCommandesClients;
	
	// Many CommandeClient for one Client
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client; 
	

	public Long getIdCmdClient() {
		return idCmdClient;
	}

	public void setIdCmdClient(Long idCmdClient) {
		this.idCmdClient = idCmdClient;
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

	public List<LigneCmdClient> getLignesCommandesClients() {
		return lignesCommandesClients;
	}

	public void setLignesCommandesClients(List<LigneCmdClient> lignesCommandesClients) {
		this.lignesCommandesClients = lignesCommandesClients;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

	
	
	
	
	

}
