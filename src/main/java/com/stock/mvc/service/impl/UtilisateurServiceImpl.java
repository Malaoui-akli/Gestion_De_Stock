package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IUtilisateurDao;
import com.stock.mvc.entites.Utilisateur;
import com.stock.mvc.service.IUtilisateurService;
@Component
@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

	@Autowired
	private IUtilisateurDao dao;

	@Override
	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Utilisateur> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Utilisateur> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public Utilisateur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public Utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

}
