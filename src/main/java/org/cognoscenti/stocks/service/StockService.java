package org.cognoscenti.stocks.service;

import java.util.List;

public interface StockService<T> {
	
	T save(T t);
	
	T update(T t);
	
	void delete(T t);
	
	T get(Long id, Class<T> clazz);
	
	List<T> findAll(Class<T> clazz);
	
}