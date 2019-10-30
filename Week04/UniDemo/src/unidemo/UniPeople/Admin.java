/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo.UniPeople;

import unidemo.Course;

/**
 *
 * @author afernandez
 */
public class Admin {
    public static void assignCourse(Student student, Course temp){
    
        student.course = temp;
        
    }
    
    public static void assignCourse(Lecturer lecturer, Course temp){
        temp.setTeacher(lecturer);
        lecturer.course = temp;
        
    }
    

    public static void getDetails(UniPeople person)
    {
    System.out.println(person.getName() + person.getId());
    
        if (person.course != null && person.course.getCode() != null) {
            System.out.println(person.course.getCode());
        }
    }
}
