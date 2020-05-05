package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Vente;



public interface IVenteService {
	
	
    public Vente save (Vente entity); //Save the entity 
	
	public Vente update (Vente entity); //Update the entity
	
	public List<Vente> selectAll(); //Select the entity from the List of entities
	
	public Vente getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Vente> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Vente findOne(String paramName, Object paramValue);
	
	public Vente findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
