/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author aluno
 */
public class LoginDAO {
    
    public static User validate(String username, String password){
        User user = null;
        
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("FROM User WHERE username = :username AND password = :password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            user = (User) query.getSingleResult();
            tx.commit();
        } catch (Exception ex) {
            user = null;
            tx.rollback();
        }
        session.close();
        return user;
    }
}
