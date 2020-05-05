package com.stock.mvc.dao;

import java.util.List;

//Here we don't write code, it's just the methods
//This methods are used in the implementationDAO



public interface IGenericDao<E> {
	
	public E save (E entity); //Save the entity 
	
	public E update (E entity); //Update the entity
	
	public List<E> selectAll(); //Select the entity from the List of entities
	
	public E getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<E> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public E findOne(String paramName, Object paramValue);
	
	public E findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	
	
	
	
	
	

}
