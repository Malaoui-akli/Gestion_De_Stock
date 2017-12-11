package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.LigneCmdFournisseur;

public interface ILigneCmdFournisseurService {	

	public LigneCmdFournisseur save(LigneCmdFournisseur entity);
	public LigneCmdFournisseur update(LigneCmdFournisseur entity);
	public List<LigneCmdFournisseur> findAll();
	public List<LigneCmdFournisseur> findAll(String sortField, String sort);
	public LigneCmdFournisseur getById(Long id);
	public void remove(Long id);
	public LigneCmdFournisseur findOne(String paramName, Object paramValue);
	public LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValues );
	public int findCountBy(String paramName, Object paramValue);

}
