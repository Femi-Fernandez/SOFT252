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
    public static void assignCourse(UniPeople person, Course temp){
    
        person.course.setCode(temp.getCode());
    }
    
    public static void getDetails(UniPeople person)
    {
    System.out.println(person.getName() + person.getId());
    
        if (person.course != null && person.course.getCode() != null) {
            System.out.println(person.course.getCode());
        }
    }
}
