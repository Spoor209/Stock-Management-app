package com.stock.mvc.dao.impl;

import java.util.List;

import javax.persistence.Query;

import com.stock.mvc.dao.ILigneCmdClientDao;
import com.stock.mvc.entities.LigneCmdClient;

public class LigneCmdClientDaoImpl extends GenericDaoImpl<LigneCmdClient> implements ILigneCmdClientDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<LigneCmdClient> getByIdCommande(Long idCmdClient) {
		String queryString = "select lc from " + LigneCmdClient.class.getSimpleName() + " lc where lc.commandeClient.idCmdClient = :x";
		Query query = em.createQuery(queryString);
		query.setParameter("x", idCmdClient);
		return query.getResultList();
	}

}
