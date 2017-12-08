package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.entites.Client;
import com.stock.mvc.service.IClientService;
@Component
@Transactional
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDao dao;

	@Override
	public Client save(Client entity) {
		return dao.save(entity);
	}

	@Override
	public Client update(Client entity) {
		return dao.update(entity);
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Client> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

}
