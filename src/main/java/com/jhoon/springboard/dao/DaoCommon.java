package com.jhoon.springboard.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import com.jhoon.springboard.util.HibernateUtil;

public class DaoCommon<T> {
    
    SessionFactory factory;
    Class<?> clazz;
    private String objectName;
    private int numPerPage = 5;
    
    public DaoCommon(Class<?> clazz) {
        this.factory = HibernateUtil.getSessionFactory();
        this.clazz = clazz;
        this.objectName = clazz.getSimpleName();
    }

    public List<?> selectList() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery(" from " + objectName);
        List<?> list = query.list();
        session.getTransaction().commit();
        
        return list;
    }
    public List<?> getPagingList(int requestPage){
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = (Query) session.createQuery(" from " + objectName + " order by wrNum ");

        query.setFirstResult((requestPage-1)*numPerPage ); 
        query.setMaxResults(numPerPage); 
        
        List<?> list = query.list();
        tx.commit();
        return list;
    }

    public void delete(T object) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }

    public void update(T object) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
    }

    public T selectById(int i) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        T object = (T) session.get(clazz, i); //load
        session.getTransaction().commit();
        return object;
    }

    public void insert(T object) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    public int deleteAll() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery(" delete from " + objectName);
        int rows = query.executeUpdate();
        session.getTransaction().commit();
        return rows;
    }
    public long count() {
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        long result = (Long) session.createCriteria(clazz).setProjection(Projections.rowCount()).uniqueResult();
        tx.commit();
        return result;
    }
    public int excuteSql(String queryString) {
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        SQLQuery query = session.createSQLQuery(queryString);
        int rows = query.executeUpdate();
        tx.commit();
        return rows;
    }
}
