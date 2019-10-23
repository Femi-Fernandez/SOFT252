/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo.UniPeople;

/**
 *
 * @author afernandez
 */
public class Student extends UniPeople {
    public void attendClass(){
    System.out.println(name + " Is attending " + course.getCode() + " in room " 
                      + course.getRoom());
    }
    
    public void doCoursework(){
        System.out.println(name + " is doing coursework " + course.getCoursework());
    }

    public Student(String name, int id) {
        super(id, name);
    }
       
}
