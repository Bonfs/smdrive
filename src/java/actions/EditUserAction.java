/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DatabaseDAO;
import models.User;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author mathe
 */
public class EditUserAction extends ActionSupport{
    private User user;
    private String name, username, email, password;
    private SessionMap<String, Object> sessionMap;
    private boolean permissionDeniedError;
    
    @Override
    public String execute() throws Exception {
        sessionMap = (SessionMap) ActionContext.getContext().getSession();
        String u = (String) sessionMap.get("user");
        user = DatabaseDAO.getUserByUsername(u);
        if(u==null || user == null){
            permissionDeniedError = true;
            return "error";
        }
        
        
        return "success";
    }
    
    public String deleteAccount() throws Exception{
        System.out.println("delete user");
        sessionMap = (SessionMap) ActionContext.getContext().getSession();
        String u = (String) sessionMap.get("user");
        user = DatabaseDAO.getUserByUsername(u);
        if(u==null || user == null){
            DatabaseDAO.delete(user);
            return "success";
        }
        
        return "error";
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

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public boolean isPermissionDeniedError() {
        return permissionDeniedError;
    }

    public void setPermissionDeniedError(boolean permissionDeniedError) {
        this.permissionDeniedError = permissionDeniedError;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
