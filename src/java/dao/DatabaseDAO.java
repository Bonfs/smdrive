/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author aluno
 */
public class DatabaseDAO {
    
    public static boolean insert(Object obj){
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(obj);        
        tx.commit();
        return true;
    }
    
    public static User getUserByUsername(String username){
        User user = null;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        //String sql = "SELECT * FROM User, RootDirectory WHERE username = :username";
        Query query = session.createQuery("FROM User WHERE username = :username", User.class);
        //Query query = session.createSQLQuery(sql);
        query.setParameter("username", username);
        List<Object> list = null;
        try{
            
            user = (User) query.getSingleResult();
            list = query.list();
            
            tx.commit();
        } catch(Exception e){
            user = null;
            tx.rollback();
        }
        session.close();
        System.out.println(user.getRootDirectory().getPath());
        return user;
    }
    
    public boolean read(){
        return true;
    }
    
    public boolean update(){
        return true;
    }
    
    public boolean delete(){
        return true;
    }
}
