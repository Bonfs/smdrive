/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DatabaseDAO;
import dao.LoginDAO;
import java.util.Map;
import models.User;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author bonfim
 */
public class LoginAction extends ActionSupport{
    private String usuario, password;
    private SessionMap<String, Object> sessionMap;
    private boolean error;
    
    @Override
    public String execute() throws Exception {
        
        sessionMap = (SessionMap) ActionContext.getContext().getSession();
        
        User user = LoginDAO.validate(usuario, password);
        
        if(user != null){
            sessionMap.put("user", user.getUserName());
            sessionMap.put("login", true);
            return "success";
        } else{
            error = true;
            return "false";
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String logout() throws Exception{
        sessionMap.invalidate();
        sessionMap.put("name", null);
        sessionMap.remove("name");
        sessionMap.put("login", false);
        sessionMap.remove("login");
        sessionMap.entrySet();
        return "logout";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*@Override
    public void setSession(Map<String, Object> session) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.sessionMap = (SessionMap) session;
    }*/

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
    
}
