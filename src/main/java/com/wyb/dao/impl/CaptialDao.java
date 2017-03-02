package com.wyb.dao.impl;

import com.wyb.dao.ICaptialDao;
import com.wyb.pojo.Captial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wyb on 2017/2/25.
 */
@Repository
public class CaptialDao implements ICaptialDao{
    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
    public List<Captial> queryCaptial(String name){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();

        String hsql = "from Captial where name = ?";
        Query query = session.createQuery(hsql).setParameter(0, name);
        List<Captial> captialList = query.list();
        session.getTransaction().commit();
        session.close();
        return captialList;
    }
}
