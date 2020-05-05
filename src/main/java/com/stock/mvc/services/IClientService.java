package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Client;



public interface IClientService {
	
	
    public Client save (Client entity); //Save the entity 
	
	public Client update (Client entity); //Update the entity
	
	public List<Client> selectAll(); //Select the entity from the List of entities
	
	public Client getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Client> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Client findOne(String paramName, Object paramValue);
	
	public Client findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
