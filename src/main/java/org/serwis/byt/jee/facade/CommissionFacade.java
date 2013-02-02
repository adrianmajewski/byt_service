
package org.serwis.byt.jee.facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.serwis.byt.jee.domain.Commission;


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
    
    public List<Commission> searchCommissions(String search) {
        Query query = em.createQuery("SELECT c FROM Commission c WHERE LOWER(c.customerDescription) like LOWER(:search) OR LOWER(c.equipmentDescription) like LOWER(:search)");
        query.setParameter("search", "%" + search + "%");
        
        return query.getResultList();
    }
}
