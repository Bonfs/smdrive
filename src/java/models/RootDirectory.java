/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.persistence.ElementCollection;

/**
 *
 * @author aluno
 */
public class RootDirectory extends Directory{
    public final static int CAPACITY = 100 * 1000 * 1024; // Em megabytes
            
    private String ID;
    
    @ElementCollection
    private List<Directory> directories;
    
    private int actualCapacity;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }
    
}