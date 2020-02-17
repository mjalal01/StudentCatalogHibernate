/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.services;

import java.util.List;
import org.mehdiyevcs.domain.Student;

/**
 *
 * @author Incognito
 */
public interface StudentService {
    
    public List<Student> getList() throws Exception;
    
    public boolean saveStudent(Student student) throws Exception;
    
    public boolean delete(Student student) throws Exception;
}
