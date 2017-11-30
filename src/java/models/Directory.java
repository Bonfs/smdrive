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
public class Directory {
    private RootDirectory rootDirectory;
    private String path;
    private List<Arquivo> files;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Arquivo> getFiles() {
        return files;
    }

    public void setFiles(List<Arquivo> files) {
        this.files = files;
    }
}
