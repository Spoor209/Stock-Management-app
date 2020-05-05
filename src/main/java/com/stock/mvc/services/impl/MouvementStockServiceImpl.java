package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import com.stock.mvc.dao.IMouvementStockDao;
import com.stock.mvc.entities.MouvementStock;
import com.stock.mvc.services.IMouvementStockService;


@Transactional
public class MouvementStockServiceImpl implements IMouvementStockService {
	
	
	private IMouvementStockDao dao;
	
	

	@Override
	public MouvementStock save(MouvementStock entity) {
		return dao.save(entity);
	}

	@Override
	public MouvementStock update(MouvementStock entity) {
		return dao.update(entity);
	}

	@Override
	public List<MouvementStock> selectAll() {
		return dao.selectAll();
	}

	@Override
	public MouvementStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public List<MouvementStock> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MouvementStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MouvementStock findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public void setDao(IMouvementStockDao dao) {
		this.dao = dao;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
