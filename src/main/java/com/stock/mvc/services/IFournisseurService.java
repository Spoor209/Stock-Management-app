package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Fournisseur;



public interface IFournisseurService {
	
	
    public Fournisseur save (Fournisseur entity); //Save the entity 
	
	public Fournisseur update (Fournisseur entity); //Update the entity
	
	public List<Fournisseur> selectAll(); //Select the entity from the List of entities
	
	public Fournisseur getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Fournisseur> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Fournisseur findOne(String paramName, Object paramValue);
	
	public Fournisseur findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
