package org.serwis.byt.jee.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.serwis.byt.jee.domain.User;


@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public User get(String login) {
        Query query = em.createQuery("SELECT u FROM User_T u WHERE u.login = :login");
        query.setParameter("login", login);
        
        try{
            return (User)query.getSingleResult();
        } catch(NoResultException ex) {
            return null;
        }
    }
    
}
