package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.CommandeFournisseur;

public interface ICommandeFournisseurService {	

	public CommandeFournisseur save(CommandeFournisseur entity);
	public CommandeFournisseur update(CommandeFournisseur entity);
	public List<CommandeFournisseur> findAll();
	public List<CommandeFournisseur> findAll(String sortField, String sort);
	public CommandeFournisseur getById(Long id);
	public void remove(Long id);
	public CommandeFournisseur findOne(String paramName, Object paramValue);
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues );
	public int findCountBy(String paramName, Object paramValue);

}
