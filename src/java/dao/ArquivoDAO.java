/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionContext;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import models.Arquivo;
import models.User;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author mathe
 */
public class ArquivoDAO {
    
    
    public static boolean addDirectory(String path, String directoryName) throws URISyntaxException{
        SessionMap<String, Object> sessionMap = (SessionMap) ActionContext.getContext().getSession();
        //System.out.println((String) sessionMap.get("user"));
        User user = DatabaseDAO.getUserByUsername((String) sessionMap.get("user"));
        //System.out.println(user.getName());
        File directory = new File(path+"/"+directoryName);
        if(user != null && !directory.exists()){
            Arquivo novoDiretorio = new Arquivo();
            novoDiretorio.setName(directoryName);
            novoDiretorio.setIsDirectory(true);
            novoDiretorio.setSize(0);
            novoDiretorio.setPath(directory.getPath());
            novoDiretorio.setRootDirectory(user.getRootDirectory());
            //System.out.println(user.getRootDirectory().getUser());
            user.getRootDirectory().getFiles().add(novoDiretorio);
            if(DatabaseDAO.update(user)){
                return directory.mkdir();
            }
            return false;
        }
        
        return false;
    }
    
    public static boolean addFile(String path){
        return true;
    }
}
