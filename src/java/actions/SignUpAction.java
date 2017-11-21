/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import models.User;

/**
 *
 * @author aluno
 */
public class SignUpAction extends ActionSupport {
    
    
    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUserName("usuario");
        user.setPassword("password");
        user.setEmail("matheusbonfim05@gmail.com");
        user.setName("Bonfim");
        
        
        return "success";
    }
}
