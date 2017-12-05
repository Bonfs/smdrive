/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.ArquivoDAO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author bonfim
 */
public class RootAction extends ActionSupport{
    //public static final String BASEROOT = "/home/aluno/Documentos/rootDic";
    //public static final String BASEROOT = "/home/bonfim/Documentos/rootDic";
    public static final String BASEROOT = "C:\\Users\\mathe\\Documents\\rootDic";
    //public static final String BASEROOT = "C:\\Users\\369909.UFCVIRTUAL\\Documents\\rootDic";
    
    private List<File> files;
    private String user;
    private String cPath, fileName, newDirectoryName;
    private SessionMap<String, Object> sessionMap;
    private boolean newDirectoryError, permissionDeniedError;
       
    @Override
    public String execute() throws Exception {
        sessionMap = (SessionMap) ActionContext.getContext().getSession();
        user = (String)sessionMap.get("user");
        //boolean isLogged = (boolean)sessionMap.get("login");
        if(user == null){
            permissionDeniedError = true;
            return "error";
        }
        File f = null;
        if (cPath == null){
            cPath = BASEROOT+"\\"+user;//+ username
            f = new File(cPath);//+ username
        } else{
            f = new File(cPath);
        }
        
        files = new ArrayList<File>();
        for(File fi : f.listFiles()){
            files.add(fi);            
        }
        
        return "success";
    }

    public String createDirectory() throws Exception{
        if(ArquivoDAO.addDirectory(cPath, newDirectoryName)){
            return "success";
        }else{
            return "error";
        }
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getNewDirectoryName() {
        return newDirectoryName;
    }

    public void setNewDirectoryName(String newDirectoryName) {
        this.newDirectoryName = newDirectoryName;
    }           
    
}
