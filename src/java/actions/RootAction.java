/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bonfim
 */
public class RootAction extends ActionSupport{
    public static final String BASEROOT = "/home/bonfim/Documentos/rootDic";
    
    private List<File> files;
    private String cPath, fileName;
    
    @Override
    public String execute() throws Exception {
        File f = null;
        if (cPath == null){
            f = new File(BASEROOT);//+ username
        } else{
            f = new File(cPath);
        }
        
        files = new ArrayList<File>();
        for(File fi : f.listFiles()){
            files.add(fi);            
        }
        
        return "success";
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
           
}
