package org.cognoscenti.stocks.service;

import java.util.List;

import org.cognoscenti.stocks.dao.DataAccessObject;

public abstract class AbstractStockService<T> implements StockService<T> {
	
	public abstract DataAccessObject<T> getDataAccessObject();
	
	@Override
	public T save(T t) {
		return getDataAccessObject().save(t);
	}
	
	@Override
	public T update(T t) {
		return getDataAccessObject().update(t);
	}
	
	@Override
	public void delete(T t) {
		getDataAccessObject().delete(t);
	}
	
	@Override
	public T get(Long id, Class<T> clazz) {
		return getDataAccessObject().get(id, clazz);
	}
	
	@Override
	public List<T> findAll(Class<T> clazz) {
		return getDataAccessObject().findAll(clazz);
	}
	
}