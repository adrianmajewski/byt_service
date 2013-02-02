package org.serwis.byt.jee.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.eclipse.persistence.annotations.Index;

@Entity
public class Status  implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Long id;
    
    @Index(unique=true)
    @Column(nullable=false, length=32)
    private String name;
    
    @Column(nullable=false, length=1024)
    private String description;
    
    @OneToMany(mappedBy="status")
    private List<Commission> commissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Commission> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<Commission> commissions) {
        this.commissions = commissions;
    }

    @Override
    public String toString() {
        return name;
    }
}
