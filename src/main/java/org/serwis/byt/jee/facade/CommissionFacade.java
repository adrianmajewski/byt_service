/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.serwis.byt.jee.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.serwis.byt.jee.domain.Commission;

/**
 *
 * @author wnuk
 */
@Stateless
public class CommissionFacade extends AbstractFacade<Commission> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommissionFacade() {
        super(Commission.class);
    }
    
}
