/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DatabaseDAO;
import java.io.File;
import java.util.ArrayList;
import models.Arquivo;
import models.RootDirectory;
import models.User;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author aluno
 */
public class SignUpAction extends ActionSupport {
    public static final String BASEROOT = "/home/aluno/Documentos/rootDic";
    //public static final String BASEROOT = "C:\\Users\\mathe\\Documents\\rootDic";
    private String name, username, email, password, confirmPassword;
    private SessionMap<String, Object> sessionMap;
    
    @Override
    public String execute() throws Exception {
        sessionMap = (SessionMap) ActionContext.getContext().getSession();
        
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setName(name);
        File newRootDirectory = new File(BASEROOT, user.getUserName());
                        
        RootDirectory root = new RootDirectory();
        root.setActualCapacity(0);
        root.setPath(newRootDirectory.getPath());
        root.setFiles(new ArrayList<Arquivo>());
        
        user.setRootDirectory(root);
        
        
        if(DatabaseDAO.insert(user)){
            sessionMap.put("user", user.getUserName());
            sessionMap.put("login", true);
                newRootDirectory.mkdir();
                return "success";
            
        } else{
            return "false";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    
}
