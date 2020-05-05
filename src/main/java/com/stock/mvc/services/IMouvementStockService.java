package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.MouvementStock;



public interface IMouvementStockService {
	
	
    public MouvementStock save (MouvementStock entity); //Save the entity 
	
	public MouvementStock update (MouvementStock entity); //Update the entity
	
	public List<MouvementStock> selectAll(); //Select the entity from the List of entities
	
	public MouvementStock getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<MouvementStock> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public MouvementStock findOne(String paramName, Object paramValue);
	
	public MouvementStock findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
