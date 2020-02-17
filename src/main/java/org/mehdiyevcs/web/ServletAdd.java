/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mehdiyevcs.domain.Address;
import org.mehdiyevcs.domain.Student;
import org.mehdiyevcs.servicesImpl.StudentServicesImpl;

/**
 *
 * @author Incognito
 */
@WebServlet("/ServletAdd")
public class ServletAdd extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try{
            StudentServicesImpl impl = new StudentServicesImpl();
            
            
            Address address = new Address();
            address.setCountry(req.getParameter("country"));
            address.setStreet_name(req.getParameter("streetName"));
            address.setStreet_number(req.getParameter("streetNumber"));
            
            Student student = new Student();
            student.setName(req.getParameter("name"));
            student.setAddress(address);
            
            impl.saveStudent(student);
            
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    
}
