/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs;

import java.util.List;
import javax.persistence.*;
import org.mehdiyevcs.domain.Address;
import org.mehdiyevcs.domain.Student;
import org.mehdiyevcs.servicesImpl.StudentServicesImpl;

/**
 *
 * @author Incognito
 */
public class Application {
    
    public static void main(String[] args) throws Exception {
       
        StudentServicesImpl serv = new StudentServicesImpl();
        
        Student student = new Student();
        Address address = new Address();
        student.setName("Jalal");
        address.setStreet_name("street");
        address.setStreet_number("2");
        address.setCountry("az");
        student.setAddress(address);
        
        serv.saveStudent(student);
       
    }
    
}
