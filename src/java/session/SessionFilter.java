/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import com.opensymphony.xwork2.ActionContext;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;

/**
 *
 * @author mathe
 */
public class SessionFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uri = ((HttpServletRequest) request).getRequestURI();
        System.out.println("URI: " + uri);
        
        request.setCharacterEncoding("UTF-8");
        if(uri != null && (uri.equals("/smdrive/js/main.js") 
                || uri.equals("/smdrive/")
                || uri.equals("/smdrive/index.jsp")
                || uri.equals("/smdrive/signup.jsp")
                || uri.equals("/smdrive/root.jsp")
                || uri.equals("/smdrive/404.jsp")
                || uri.equals("/smdrive/css/style.css")
                || uri.equals("/smdrive/css/bootstrap.min.css")
                || uri.equals("/smdrive/js/jquery.min.js")
                || uri.equals("/smdrive/js/bootstrap.min.js")) ){
            SessionMap<String, Object>sessionMap = (SessionMap) ActionContext.getContext().getSession();
            //if(uri.equals("/smdrive/") || uri.equals("/smdrive/index.jsp") || uri.equals("/smdrive/signup.jsp")){}
            chain.doFilter(request, response);     
        } else{
            System.out.println("Requisição bloqueada!");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
            
    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
