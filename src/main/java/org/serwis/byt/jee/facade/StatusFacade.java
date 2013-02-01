/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.serwis.byt.jee.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.serwis.byt.jee.domain.Status;

/**
 *
 * @author wnuk
 */
@Stateless
public class StatusFacade extends AbstractFacade<Status> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StatusFacade() {
        super(Status.class);
    }
    
}
