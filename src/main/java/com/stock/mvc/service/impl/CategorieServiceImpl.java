package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICategorieDao;
import com.stock.mvc.entites.Categorie;
import com.stock.mvc.service.ICategorieService;
@Component
@Transactional
public class CategorieServiceImpl implements ICategorieService {

	@Autowired
	private ICategorieDao dao;

	@Override
	public Categorie save(Categorie entity) {
		return dao.save(entity);
	}

	@Override
	public Categorie update(Categorie entity) {
		return dao.update(entity);
	}

	@Override
	public List<Categorie> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Categorie> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public Categorie getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public Categorie findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Categorie findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}

}
