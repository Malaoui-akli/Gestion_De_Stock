package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IFournisseurDao;
import com.stock.mvc.entites.Fournisseur;
import com.stock.mvc.service.IFournisseurService;
@Component
@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	@Autowired
	private IFournisseurDao dao;

	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Fournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Fournisseur> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

}
