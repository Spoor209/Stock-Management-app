package com.stock.mvc.entities;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Transient;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

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
	
	//@Transient
	//private String ligneCommandeJson;
	
	// Pour éviter les surchages et de recup les sous-entités. JsonIgnore pour éviter de recup les lignecmdeclient
	@JsonIgnore
	public List<LigneCmdClient> getLigneCommandeClients() {
		return lignesCommandesClients;
	}

	public void setLigneCommandeClients(List<LigneCmdClient> ligneCommandeClients) {
		this.lignesCommandesClients = ligneCommandeClients;
	}
	
	// Permet de ne pas l'afficher dans la base de données 
	@Transient
	private BigDecimal totalCommande;
	
    // Calcul du total de la commande 
	public BigDecimal getTotalCommande() {
		//initialise totalCommande pour qu'il soit
		totalCommande= BigDecimal.ZERO;
		if(!lignesCommandesClients.isEmpty()) {
			for(LigneCmdClient ligneCmdClient : lignesCommandesClients) {
				if(ligneCmdClient.getQuantite()!=null && ligneCmdClient.getPrixUnitaire()!=null) {
					
					BigDecimal totalLigne = ligneCmdClient.getQuantite().multiply(ligneCmdClient.getPrixUnitaire());
					totalCommande = totalCommande.add(totalLigne);
				}
				
			}
		}
		
		return totalCommande;
	}

	
	public void setTotalCommande(BigDecimal totalCommande) {
		this.totalCommande = totalCommande;
	}

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

	@JsonIgnore
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

	// On converti un object java en json avec ObjectMapper
	@Transient
	public String getLigneCommandeJson() {
		if(!lignesCommandesClients.isEmpty()) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writeValueAsString(lignesCommandesClients);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}

	/*public void setLigneCommandeJson(String ligneCommandeJson) {
		this.ligneCommandeJson = ligneCommandeJson;
	}*/
	
	
	
	

	
	
	
	
	

}
