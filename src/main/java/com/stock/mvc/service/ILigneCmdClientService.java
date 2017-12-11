package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.LigneCmdClient;

public interface ILigneCmdClientService {	

	public LigneCmdClient save(LigneCmdClient entity);
	public LigneCmdClient update(LigneCmdClient entity);
	public List<LigneCmdClient> findAll();
	public List<LigneCmdClient> findAll(String sortField, String sort);
	public LigneCmdClient getById(Long id);
	public void remove(Long id);
	public LigneCmdClient findOne(String paramName, Object paramValue);
	public LigneCmdClient findOne(String[] paramNames, Object[] paramValues );
	public int findCountBy(String paramName, Object paramValue);

}
