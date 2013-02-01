package org.serwis.byt.jee.controller;

import java.io.IOException;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.serwis.byt.jee.domain.User;
import org.serwis.byt.jee.facade.UserFacade;


@ManagedBean(name = "authorizationController")
@RequestScoped
public class AuthorizationController implements Serializable {

    private String login;
    private String password;
    
    @EJB
    private UserFacade userFacade;
    
    public AuthorizationController() {
        
    }

    public String loginUser() throws NoSuchAlgorithmException {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        User user = userFacade.get(login);
        
        if(user != null && user.getLogin().equals(login)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("authenticated", login);
            return "commission/List";
        }
        return "login";
    }
    
    public void logout() throws IOException {
        HttpServletRequest request = getRequest();
        HttpServletResponse response = getResponse();
        HttpSession session = request.getSession(true);
        session.invalidate();
        
        response.sendRedirect(request.getContextPath() + "/faces/login.xhtml");
    }

    private HttpServletResponse getResponse() {
        return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    }

    private HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
