/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.dao;

import java.util.List;
import javax.persistence.*;
import org.mehdiyevcs.domain.Address;

/**
 *
 * @author Incognito
 */
public class AddressDao extends GenericDao{
    
    
    public List<Address> getList() throws Exception{
        
        List<Address> result = null;
                
                try{
                 
                    String hql = "select a from Address a";
                    em = getEntityManager();
                    Query query = em.createQuery(hql);
                    result = query.getResultList();
                    
                }catch(Exception ex){
                    ex.printStackTrace();
                }finally{
                    if(em!=null){
                        em.close();
                    }
                }
                
        return result;
    }
    
    public void insert(Address address) throws Exception{
        
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(address);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
    }
    
    public void update(Address address) throws Exception{
        
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(address);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        
    }
    
    public void delete(Address address) throws Exception{
        
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(address);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        
    }
    
}
