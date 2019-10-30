/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

import unidemo.UniPeople.*;
/**
 *
 * @author afernandez
 */
public class UniDemo {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course course = new Course("15234", "Room 210");
        Student student = new Student("John", 64);
        Lecturer lecturer = new Lecturer("Joseph", 99);
    
        Admin.getDetails(student);
        
        Admin.assignCourse(lecturer, course);
        Admin.assignCourse(student, course);
       
        
        lecturer.teach();
        
        student.attendClass();
        
        student.doCoursework();
            
        lecturer.setCoursework("Design Document");
        
        student.doCoursework();
        
        Admin.getDetails(student);
               
        
    }
    
}
