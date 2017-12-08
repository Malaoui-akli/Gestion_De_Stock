package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCmdClientDao;
import com.stock.mvc.entites.LigneCmdClient;
import com.stock.mvc.service.ILigneCmdClientService;
@Component
@Transactional
public class LigneCmdClientServiceImpl implements ILigneCmdClientService {

	@Autowired
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
	public List<LigneCmdClient> findAll() {
		return dao.findAll();
	}

	@Override
	public List<LigneCmdClient> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
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
	public LigneCmdClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ILigneCmdClientDao dao) {
		this.dao = dao;
	}

}
