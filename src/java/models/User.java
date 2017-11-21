/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bonfim
 */
@Entity
@Table(name="\"User\"")
public class User {
    
    @Id @GeneratedValue
    private Long id;
    
    @Column(nullable = false, unique = true, length = 20)
    private String userName;
    
    @Column(nullable = false, length = 65)
    private String name;
    
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    
    @Column(nullable = false, length = 32)
    private String password;

    public User() {
    }

    public User(String userName, String name, String email, String password) {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long ID) {
        this.id = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
