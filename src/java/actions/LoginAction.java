/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bonfim
 */
public class LoginAction extends ActionSupport {
    private String username, password;
    
    @Override
    public String execute() throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure();
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
     
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardRegistry);
        Session session = sessionFactory.openSession();
        
        User user = new User();
        user.setUserName("bonfs");
        user.setPassword("123456");
        user.setEmail("matheusbonfim05@gmail.com");
        user.setName("Bonfim");
        
        Transaction tx = session.beginTransaction();
        session.save(user);        
        tx.commit();
        
        return "success";
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}
