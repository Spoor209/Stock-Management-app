package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.LigneCmdFournisseur;



public interface ILigneCmdFournisseurService {
	
	
    public LigneCmdFournisseur save (LigneCmdFournisseur entity); //Save the entity 
	
	public LigneCmdFournisseur update (LigneCmdFournisseur entity); //Update the entity
	
	public List<LigneCmdFournisseur> selectAll(); //Select the entity from the List of entities
	
	public LigneCmdFournisseur getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<LigneCmdFournisseur> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public LigneCmdFournisseur findOne(String paramName, Object paramValue);
	
	public LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
