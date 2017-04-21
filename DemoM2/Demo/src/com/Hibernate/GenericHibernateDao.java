//package com.intumit.orm.hibernate;
//
//import java.io.Serializable;
//import java.lang.reflect.ParameterizedType;
//import java.util.List;
//
//import net.sf.hibernate.Hibernate;
//import net.sf.hibernate.HibernateException;
//import net.sf.hibernate.Query;
//import net.sf.hibernate.Session;
//import net.sf.hibernate.Transaction;
//
//import org.apache.log4j.Logger;
//
//import com.intumit.orm.GenericDao;
//import com.intumit.orm.SessionFactory;
//import com.intumit.orm.SessionUtil;
//
//public class GenericHibernateDao<T> implements GenericDao<T> {
//    protected static final Logger log = Logger.getLogger(GenericHibernateDao.class);
//
//    protected Class<T> persistentClass;
//
//    @SuppressWarnings("unchecked")
//    public GenericHibernateDao() {
//        this.persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass())
//                .getActualTypeArguments()[0];
//    }
//
//    public Class<T> getPersistentClass() {
//        return persistentClass;
//    }
//
//    public List<T> find(String hql, HibernateQuerySetter setter) {
//        Session sess = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            Query q = sess.createQuery(hql);
//            setter.setParems(q);
//            @SuppressWarnings("unchecked")
//            List<T> result = q.list();
//            return result;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public List<T> find(String hql) {
//        Session sess = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            @SuppressWarnings("unchecked")
//            List<T> result = (List<T>)sess.find(hql);
//            return result;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public List<T> findAll() {
//        return find("from " + persistentClass.getName());
//    }
//
//    @SuppressWarnings("unchecked")
//    public T findById(Serializable id) {
//        Session sess = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            return (T)sess.get(persistentClass, id);
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public void delete(T entity) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            sess.delete(entity);
//            tx.commit();
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public void delete(Long id) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            sess.delete("from " + persistentClass.getName() + " o where o.id=?", id, Hibernate.LONG);
//            tx.commit();
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public T save(T entity) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            sess.save(entity);
//            tx.commit();
//            return entity;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public T update(T entity) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            sess.update(entity);
//            tx.commit();
//            return entity;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public T saveOrUpdate(T entity) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            sess.saveOrUpdate(entity);
//            tx.commit();
//            return entity;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//    public T merge(T entity) {
//        Session sess = null;
//        Transaction tx = null;
//        try {
//            sess = SessionFactory.getInstance().openSession();
//            tx = sess.beginTransaction();
//            @SuppressWarnings("unchecked")
//            T mergedEntity = (T)sess.saveOrUpdateCopy(entity);
//            tx.commit();
//            return mergedEntity;
//        }
//        catch (HibernateException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            SessionUtil.closeSession(sess);
//        }
//    }
//
//}
