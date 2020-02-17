/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Incognito
 */
public abstract class GenericDao {
    
    protected EntityManager em;
    private EntityManagerFactory emf=null;
    private final String PERSISTENCE_UNIT="Temp";
    
    public GenericDao(){
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }
    
    protected EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
}
