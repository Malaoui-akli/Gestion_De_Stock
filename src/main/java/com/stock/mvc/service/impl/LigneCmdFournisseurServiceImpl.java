package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCmdFournisseurDao;
import com.stock.mvc.entites.LigneCmdFournisseur;
import com.stock.mvc.service.ILigneCmdFournisseurService;
@Component
@Transactional
public class LigneCmdFournisseurServiceImpl implements ILigneCmdFournisseurService {

	@Autowired
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
	public List<LigneCmdFournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneCmdFournisseur> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
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
	public LigneCmdFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ILigneCmdFournisseurDao dao) {
		this.dao = dao;
	}

}
