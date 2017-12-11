package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICommandeClientDao;
import com.stock.mvc.entites.CommandeClient;
import com.stock.mvc.service.ICommandeClientService;
@Component
@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService {

	@Autowired
	private ICommandeClientDao dao;

	@Override
	public CommandeClient save(CommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeClient> findAll() {
		return dao.findAll();
	}

	@Override
	public List<CommandeClient> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public CommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public CommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}

}
