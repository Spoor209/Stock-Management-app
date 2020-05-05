package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import com.stock.mvc.dao.ILigneCmdClientDao;
import com.stock.mvc.entities.LigneCmdClient;
import com.stock.mvc.services.ILigneCmdClientService;


@Transactional
public class LigneCmdClientServiceImpl implements ILigneCmdClientService {
	
	
	

	public void setDao(ILigneCmdClientDao dao) {
		this.dao = dao;
	}

	private ILigneCmdClientDao dao;
	
	

	@Override
	public LigneCmdClient save(LigneCmdClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCmdClient update(LigneCmdClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCmdClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public LigneCmdClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public List<LigneCmdClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCmdClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<LigneCmdClient> getByIdCommande(Long idCommandeClient) {
		return dao.getByIdCommande(idCommandeClient);
	}
}
