package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.entites.CommandeFournisseur;
import com.stock.mvc.service.ICommandeFournisseurService;
@Component
@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {

	@Autowired
	private ICommandeFournisseurDao dao;

	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeFournisseur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<CommandeFournisseur> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

}
