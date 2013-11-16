package org.cognoscenti.stocks.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractDataAccessObject<T> implements DataAccessObject<T> {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public T save(T t) {
		
		entityManager.persist(t);
		return t;
	}
	
	@Override
	public T update(T t) {
		
		return entityManager.merge(t);
	}
	
	@Override
	public T get(Long id, Class<T> clazz) {
		
		return entityManager.find(clazz, id);
	}
	
	@Override
	public void delete(T t) {
		
		entityManager.remove(t);
	}
	
	@Override
	public List<T> findAll(Class<T> clazz) {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
		Root<T> root = criteriaQuery.from(clazz);
		criteriaQuery.select(root);
		
		return entityManager.createQuery(criteriaQuery).getResultList();
	}
	
	@Override
	public List<T> findByParameters(Class<T> clazz, Map<String, Object> parameters) {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
		Root<T> root = criteriaQuery.from(clazz);
		criteriaQuery.select(root);
		
		for(String fieldName : parameters.keySet()) {
			criteriaQuery.where(criteriaBuilder.equal(root.get(fieldName), parameters.get(fieldName)));
		}
		
		return entityManager.createQuery(criteriaQuery).getResultList();
	}
	
	@Override
	public List<T> findByParametersAndOrderBy(Class<T> clazz, Map<String, Object> parameters, String orderBy) {

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(clazz);
		Root<T> root = criteriaQuery.from(clazz);
		criteriaQuery.select(root);
		
		for(String fieldName : parameters.keySet()) {
			criteriaQuery.where(criteriaBuilder.equal(root.get(fieldName), parameters.get(fieldName)));
		}
		
		criteriaQuery.orderBy(criteriaBuilder.asc(root.get(orderBy)));
		
		return entityManager.createQuery(criteriaQuery).getResultList();
	}
	
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}