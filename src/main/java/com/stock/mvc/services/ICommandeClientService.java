package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.CommandeClient;



public interface ICommandeClientService {
	
	
    public CommandeClient save (CommandeClient entity); //Save the entity 
	
	public CommandeClient update (CommandeClient entity); //Update the entity
	
	public List<CommandeClient> selectAll(); //Select the entity from the List of entities
	
	public CommandeClient getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<CommandeClient> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public CommandeClient findOne(String paramName, Object paramValue);
	
	public CommandeClient findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
