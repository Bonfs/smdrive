/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;

/**
 *
 * @author aluno
 */
@Entity
public class RootDirectory implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "rootDirectory_id")
    private Long id;
    
    @OneToOne(mappedBy = "rootDirectory")
    private User user; 
        
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Arquivo> files;
    
    @Column(nullable = false)
    private int actualCapacity;
    
    @Column(nullable = false)
    private String path;

    public RootDirectory() {
    }  

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public List<Arquivo> getFiles() {
        return files;
    }

    public void setFiles(List<Arquivo> files) {
        this.files = files;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
    
}