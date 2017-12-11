package com.stock.mvc.dao.impl;

import org.springframework.stereotype.Component;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.entites.Article;

@Component
public class ArticleDaoImpl extends GeneriqueDaoImpl<Article> implements IArticleDao {

}
