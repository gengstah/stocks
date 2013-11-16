package org.cognoscenti.stocks.dao;

import java.util.List;
import java.util.Map;

public interface DataAccessObject<T> {
	
	T save(T t);
	
	T update(T t);
	
	void delete(T t);
	
	T get(Long id, Class<T> clazz);
	
	List<T> findAll(Class<T> clazz);
	
	List<T> findByParameters(Class<T> clazz, Map<String, Object> parameters);
	
	List<T> findByParametersAndOrderBy(Class<T> clazz, Map<String, Object> parameters, String orderBy);
}