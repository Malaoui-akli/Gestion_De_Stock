package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneVenteDao;
import com.stock.mvc.entites.LigneVente;
import com.stock.mvc.service.ILigneVenteService;
@Component
@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService {

	@Autowired
	private ILigneVenteDao dao;

	@Override
	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneVente> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneVente> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public LigneVente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}

}
