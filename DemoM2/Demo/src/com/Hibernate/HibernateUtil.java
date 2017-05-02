package com.Hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil<T> {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		// sessionFactory =new
		// Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

	public boolean save(Object entity) {
		boolean result = false;
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			tx = sess.beginTransaction();
			sess.save(entity);
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e);
		} finally {
			sess.close();
		}
		return result;
	}

	public boolean update(Object entity) {
		boolean result = false;
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			tx = sess.beginTransaction();
			sess.update(entity);
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e);
		} finally {
			sess.close();
		}
		return result;
	}

	public boolean delete(Object entity) {
		boolean result = false;
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			tx = sess.beginTransaction();
			sess.delete(entity);
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return result;
	}

	public List<T> select(Object object) {
		Session sess = null;
		List<T> arraylist = new ArrayList<T>();
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sess.createCriteria(object.getClass());
			Iterator iterator = criteria.list().iterator();
			while (iterator.hasNext()) {
				arraylist.add((T) iterator.next());
			}
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			sess.close();
		}
		return arraylist;
	}

	public Object selectByid(Object object, int id) {
		Session sess = null;
		Object returnObject = null;
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			returnObject = sess.get(object.getClass(), id);
		} catch (HibernateException e) {
			throw new RuntimeException(e);
		} finally {
			sess.close();
		}
		return returnObject;
	}

	public boolean saveOrUpdate(Object entity) {
		boolean result = false;
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSessionFactory().openSession();
			tx = sess.beginTransaction();
			sess.saveOrUpdate(entity);
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e);
		} finally {
			sess.close();
		}
		return result;
	}

}
