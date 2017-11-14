/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author aluno
 */
public class RootDirectory extends Directory{
    public final static int CAPACITY = 1000 * 1024;
            
    private String ID;
    private List<Directory> directories;
    private int actualCapacity;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }
    
}