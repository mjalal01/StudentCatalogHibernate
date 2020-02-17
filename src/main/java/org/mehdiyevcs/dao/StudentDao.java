/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.dao;

import java.util.List;
import javax.persistence.*;
import org.mehdiyevcs.domain.Student;

/**
 *
 * @author Incognito
 */
public class StudentDao extends GenericDao{
    
    
    
    public List<Student> getList() throws Exception{
        
        List<Student> result = null;
        try{
            String hql = "select s from Student s";
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
    
    public void insert(Student student) throws Exception{
        
        try{
            
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        
    }
    
    
    public void update(Student student) throws Exception{
        
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
    }
    
    public void delete(Student student) throws Exception{
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(student);
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
