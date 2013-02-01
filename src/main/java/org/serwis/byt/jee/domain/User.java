package org.serwis.byt.jee.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.eclipse.persistence.annotations.Index;

@Entity(name="User_T")
public class User  implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Long id;
    
    @Index(unique=true)
    @Column(nullable=false, length=64)
    private String login;
    
    @Column(nullable=false, length=64)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
