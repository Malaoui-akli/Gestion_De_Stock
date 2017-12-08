package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Categorie;

public interface ICategorieService {	

	public Categorie save(Categorie entity);
	public Categorie update(Categorie entity);
	public List<Categorie> findAll();
	public List<Categorie> findAll(String sortField, String sort);
	public Categorie getById(Long id);
	public void remove(Long id);
	public Categorie findOne(String paramName, Object paramValue);
	public Categorie findOne(String[] paramNames, Object[] paramValues );
	public int findCountBy(String paramName, Object paramValue);

}
