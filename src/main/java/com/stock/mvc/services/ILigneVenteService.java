package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.LigneVente;



public interface ILigneVenteService {
	
	
    public LigneVente save (LigneVente entity); //Save the entity 
	
	public LigneVente update (LigneVente entity); //Update the entity
	
	public List<LigneVente> selectAll(); //Select the entity from the List of entities
	
	public LigneVente getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<LigneVente> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public LigneVente findOne(String paramName, Object paramValue);
	
	public LigneVente findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
