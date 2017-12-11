package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Fournisseur;

public interface IFournisseurService {	

	public Fournisseur save(Fournisseur entity);
	public Fournisseur update(Fournisseur entity);
	public List<Fournisseur> findAll();
	public List<Fournisseur> findAll(String sortField, String sort);
	public Fournisseur getById(Long id);
	public void remove(Long id);
	public Fournisseur findOne(String paramName, Object paramValue);
	public Fournisseur findOne(String[] paramNames, Object[] paramValues );
	public int findCountBy(String paramName, Object paramValue);

}
