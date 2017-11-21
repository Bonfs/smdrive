/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
        session.save(obj);        
        tx.commit();
        return true;
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
