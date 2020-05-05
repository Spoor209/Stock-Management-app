package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.CommandeFournisseur;



public interface ICommandeFournisseurService {
	
	
    public CommandeFournisseur save (CommandeFournisseur entity); //Save the entity 
	
	public CommandeFournisseur update (CommandeFournisseur entity); //Update the entity
	
	public List<CommandeFournisseur> selectAll(); //Select the entity from the List of entities
	
	public CommandeFournisseur getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<CommandeFournisseur> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public CommandeFournisseur findOne(String paramName, Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
