/**
 * 
 */
package com.venkat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author talluri
 *
 */
@Repository(value="baseDao")
@Transactional
public class BaseDaoImpl implements BaseDao {

	@PersistenceContext
	private EntityManager em;
	
	/* (non-Javadoc)
	 * @see com.venkat.dao.BaseDao#persist(java.lang.Object)
	 */
	@Override
	public void persist(Object obj) {
		em.persist(obj);
	}

	/* (non-Javadoc)
	 * @see com.venkat.dao.BaseDao#getAll(java.lang.Class)
	 */
	@Override
	public <T> List<T> getAll(Class<T> clazz) {
	TypedQuery<T> query=em.createQuery("from "+clazz.getName(), clazz);
		return query.getResultList();
	}
	
	
}
