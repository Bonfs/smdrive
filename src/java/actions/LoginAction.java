/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import dao.DatabaseDAO;
import models.User;

/**
 *
 * @author bonfim
 */
public class LoginAction extends ActionSupport {
    private String usuario, password;
    
    @Override
    public String execute() throws Exception {
        
        User user = new User();
        user.setUserName(usuario);
        user.setPassword(password);
        user.setEmail("matheusbonfim05@gmail.com");
        user.setName("Bonfim");
        
        
        if(DatabaseDAO.insert(user)){
            return "success";
        } else{
            return "false";
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}
