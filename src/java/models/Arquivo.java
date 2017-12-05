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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author aluno
 */
@Entity
public class Arquivo {
    @Id @GeneratedValue @Column(name = "arquivo_id")
    private Long ID;
    
    @Column(nullable = false)
    private long size;
    
    @Column(nullable = false)
    private String path;
    
    @Column(length = 5)
    private String extension;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private boolean isDirectory;
    
    @ManyToOne(targetEntity = RootDirectory.class)
    private RootDirectory rootDirectory;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsDirectory() {
        return isDirectory;
    }

    public void setIsDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public RootDirectory getRootDirectory() {
        return rootDirectory;
    }

    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }
    
    
    
}
