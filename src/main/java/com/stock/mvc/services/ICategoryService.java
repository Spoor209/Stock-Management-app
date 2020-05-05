package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Category;



public interface ICategoryService {
	
	
    public Category save (Category entity); //Save the entity 
	
	public Category update (Category entity); //Update the entity
	
	public List<Category> selectAll(); //Select the entity from the List of entities
	
	public Category getById(Long id); //Get the entity via the id
	
	public void remove(Long id);
	
	public List<Category> selectAll(String sortField, String sort ); //Like Select*from table with 2 parameters for specific research
	
	public Category findOne(String paramName, Object paramValue);
	
	public Category findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	public List<Article> selectAllArticlesByCategory(Long idCategory);

}
