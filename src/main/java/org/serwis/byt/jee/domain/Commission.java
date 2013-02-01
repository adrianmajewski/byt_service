package org.serwis.byt.jee.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.eclipse.persistence.annotations.Index;


@Entity
public class Commission implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Long id;
    
    @Index(unique=true)
    @Column(nullable=false, length=32)
    private String number;
    
    @Column(nullable=false, length=1024)
    private String customerDescription;
    
    @Column(nullable=false, length=1024)
    private String equipmentDescription;
    
    @ManyToOne
    @JoinColumn(name="status_fk", nullable=false)
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
