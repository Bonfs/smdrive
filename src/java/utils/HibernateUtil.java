/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bonfim
 */
public class HibernateUtil {
    public static Session getSession(){
        Configuration configuration = new Configuration();
        configuration.configure();
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
     
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardRegistry);
        Session session = sessionFactory.openSession();
        
        return session;
    }
}
