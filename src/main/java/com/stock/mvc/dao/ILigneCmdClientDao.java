package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entities.LigneCmdClient;

public interface ILigneCmdClientDao extends IGenericDao<LigneCmdClient> {
	
	public List<LigneCmdClient> getByIdCommande(Long idCommandeClient);


}
