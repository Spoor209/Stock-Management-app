package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Utilisateur;



public interface IUtilisateurService {
	
	
    public Utilisateur save (Utilisateur entity); //Save the entity 
	
	public Utilisateur update (Utilisateur entity); //Update the entity
	
	public List<Utilisateur> selectAll(); //Select the entity from the List of entities
	
	public Utilisateur getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Utilisateur> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Utilisateur findOne(String paramName, Object paramValue);
	
	public Utilisateur findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
