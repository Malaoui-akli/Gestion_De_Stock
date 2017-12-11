package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IMvtStockDao;
import com.stock.mvc.entites.MvtStock;
import com.stock.mvc.service.IMvtStockService;
@Component
@Transactional
public class MvtStockServiceImpl implements IMvtStockService {

	@Autowired
	private IMvtStockDao dao;

	@Override
	public MvtStock save(MvtStock entity) {
		return dao.save(entity);
	}

	@Override
	public MvtStock update(MvtStock entity) {
		return dao.update(entity);
	}

	@Override
	public List<MvtStock> findAll() {
		return dao.findAll();
	}

	@Override
	public List<MvtStock> findAll(String sortField, String sort) {
		return dao.findAll(sortField, sort);
	}

	@Override
	public MvtStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);

	}

	@Override
	public MvtStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStock findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	//Setter
	public void setDao(IMvtStockDao dao) {
		this.dao = dao;
	}

}
