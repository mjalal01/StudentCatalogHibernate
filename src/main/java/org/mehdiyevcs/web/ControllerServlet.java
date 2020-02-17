/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mehdiyevcs.domain.Student;
import org.mehdiyevcs.servicesImpl.StudentServicesImpl;

/**
 *
 * @author Incognito
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        StudentServicesImpl student = new StudentServicesImpl();
        
        try {
            List<Student> students = student.getList();
            
            req.setAttribute("students", students);
            
            req.getRequestDispatcher("/WEB-INF/listStudent.jsp").forward(req, resp);
        } catch (Exception ex) {

            ex.printStackTrace();
            
        }
        
    }
    
}
