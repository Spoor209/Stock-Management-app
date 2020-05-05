package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.LigneCmdClient;



public interface ILigneCmdClientService {
	
	
    public LigneCmdClient save (LigneCmdClient entity); //Save the entity 
	
	public LigneCmdClient update (LigneCmdClient entity); //Update the entity
	
	public List<LigneCmdClient> selectAll(); //Select the entity from the List of entities
	
	public LigneCmdClient getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<LigneCmdClient> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public LigneCmdClient findOne(String paramName, Object paramValue);
	
	public LigneCmdClient findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	public List<LigneCmdClient> getByIdCommande(Long idCommandeClient);

}
