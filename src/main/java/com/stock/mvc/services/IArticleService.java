package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Article;



public interface IArticleService {
	
	
    public Article save (Article entity); //Save the entity 
	
	public Article update (Article entity); //Update the entity
	
	public List<Article> selectAll(); //Select the entity from the List of entities
	
	public Article getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Article> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Article findOne(String paramName, Object paramValue);
	
	public Article findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
