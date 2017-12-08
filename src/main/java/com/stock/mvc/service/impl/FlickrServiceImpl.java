package com.stock.mvc.service.impl;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IFlickrDao;
import com.stock.mvc.service.IFlickrService;

@Component
@Transactional
public class FlickrServiceImpl implements IFlickrService {

	@Autowired
   private IFlickrDao dao;
	
	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
	return dao.savePhoto(photo, title);
	}

	public IFlickrDao getDao() {
		return dao;
	}

	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}

	
}
