/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.servicesImpl;

import java.util.List;
import org.mehdiyevcs.dao.StudentDao;
import org.mehdiyevcs.domain.Student;
import org.mehdiyevcs.services.StudentService;

/**
 *
 * @author Incognito
 */
public class StudentServicesImpl implements StudentService{

    StudentDao dao = new StudentDao();
    
    @Override
    public List<Student> getList() throws Exception {
        return dao.getList();
    }

    @Override
    public boolean saveStudent(Student student) throws Exception {
        try{
                dao.insert(student);
        }catch(Exception ex){
            throw new Exception("The Insert is Unsuccesfull!");
        }
        return true;
    }

    @Override
    public boolean delete(Student student) throws Exception {

        try{
            dao.delete(student);
        }catch(Exception ex){
            throw new Exception("The delete is unsuccessfull");
        }
        return true;
    }
    
    
    
}
