/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author bonfim
 */
@Entity
@Table(name="usuario")
public class User implements Serializable{
    
    @Id @GeneratedValue @Column(name = "user_id")
    private Long id;
    
    @Column(nullable = false, unique = true, length = 20)
    private String userName;
    
    @Column(nullable = false, length = 65)
    private String name;
    
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    
    @Column(nullable = false, length = 32)
    private String password;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootDirectory_id")
    private RootDirectory rootDirectory;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public RootDirectory getRootDirectory() {
        return rootDirectory;
    }

    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }
    
}
