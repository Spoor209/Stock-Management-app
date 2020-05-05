package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import com.stock.mvc.dao.ILigneCmdFournisseurDao;
import com.stock.mvc.entities.LigneCmdFournisseur;
import com.stock.mvc.services.ILigneCmdFournisseurService;


@Transactional
public class LigneCmdFournisseurServiceImpl implements ILigneCmdFournisseurService {
	
	

	public void setDao(ILigneCmdFournisseurDao dao) {
		this.dao = dao;
	}

	private ILigneCmdFournisseurDao dao;
	
	

	@Override
	public LigneCmdFournisseur save(LigneCmdFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCmdFournisseur update(LigneCmdFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCmdFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public LigneCmdFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public List<LigneCmdFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCmdFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
