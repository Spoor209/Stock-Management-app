package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.LigneCmdClient;
import com.stock.mvc.model.ModelCommandeClient;
import com.stock.mvc.model.StringResponse;
import com.stock.mvc.services.IArticleService;
import com.stock.mvc.services.IClientService;
import com.stock.mvc.services.ICommandeClientService;
import com.stock.mvc.services.ILigneCmdClientService;

@Controller
@RequestMapping(value="/commandeclient")
public class CommandeClientController {
	
	@Autowired
	private ICommandeClientService commandeService;
	
	@Autowired
	private IClientService clientService;
	
	@Autowired
	private IArticleService articleService;
	
	@Autowired
	private ILigneCmdClientService ligneCdeService;
	
	@Autowired
	private ModelCommandeClient modelCommande;
	
	
	
	@RequestMapping(value="/")
	public String commandeClient(Model model) {
	List<CommandeClient> commandesClient = commandeService.selectAll();
	if(commandesClient.isEmpty()) {
		commandesClient = new ArrayList<CommandeClient>();
	}else {
		for(CommandeClient commandeClient: commandesClient) {
			//Recupération de la list des commandes via l'IdCommande
			List<LigneCmdClient> lignesCmdClt = ligneCdeService.getByIdCommande(commandeClient.getIdCmdClient());
			commandeClient.setLigneCommandeClients(lignesCmdClt);
		}
	}
		model.addAttribute("commandesClient", commandesClient);
		return "commandeclient/commandeclient";
	}
	
	
	
	@RequestMapping(value = "/nouveau")
	public String nouvelleCommande(Model model) {
		List<Client> clients = clientService.selectAll();
		if (clients.isEmpty()) {
			clients = new ArrayList<Client>();
		}
		modelCommande.creerCommande();
		model.addAttribute("code",modelCommande.getCommande().getCode());
		model.addAttribute("dateCde", modelCommande.getCommande().getDateCommande());
		model.addAttribute("clients", clients);
		return "commandeclient/nouvellecommande";
	}
	
	
	
	@RequestMapping(value = "/creerCommande")
	@ResponseBody
	public String creerCommande(final Long idClient) {
		if (idClient == null) {
			return null;
		}
		Client client = clientService.getById(idClient);
		if (client == null) {
			return null;
		}
		
		return "OK";
	}
	
	
	@RequestMapping(value = "/ajouterLigne")
	@ResponseBody
	public LigneCmdClient getArticleByCode(final Long codeArticle) {
		if (codeArticle == null) {
			return null;
		}
		Article article = articleService.findOne("codeArticle", ""+codeArticle);
		if (article == null) {
			return null;
		}
		return modelCommande.ajouterLigneCommande(article); 
	}
	
	@RequestMapping(value = "/supprimerLigne")
	@ResponseBody
	public LigneCmdClient supprimerLigneCommande(final Long idArticle) {
		if (idArticle == null) {
			return null;
		}
		Article article = articleService.getById(idArticle);
		if (article == null) {
			return null;
		}
		return modelCommande.supprimerLigneCommande(article);
	}
	
	
	@RequestMapping(value = "/enregistrerCommande", produces = "application/json")
	@ResponseBody
	public StringResponse enregistrerCommande(HttpServletRequest request) {
		CommandeClient nouvelleCommande = null;
		if (modelCommande.getCommande() != null) {
			nouvelleCommande = commandeService.save(modelCommande.getCommande());
		}
		if (nouvelleCommande != null) {
			Collection<LigneCmdClient> ligneCommandes = modelCommande.getLignesCommandeClient(nouvelleCommande);
			if (ligneCommandes != null && !ligneCommandes.isEmpty()) {
				for (LigneCmdClient ligneCommandeClient : ligneCommandes) {
					ligneCdeService.save(ligneCommandeClient);
				}
				modelCommande.init();
			}
		}
		
		return new StringResponse(request.getContextPath() + "/commandeclient");
	}
	
	
}
