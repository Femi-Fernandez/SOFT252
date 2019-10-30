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
public class Lecturer extends UniPeople implements ITeach {
   
    public void setCoursework(String courseWork) {
        course.setCoursework(courseWork);   
    }

    
    public void teach(){
    System.out.println(name + " is teaching " + course.getCode() + " in room "
                       + course.getRoom());
    }
    
        public Lecturer(String name, int id) {
        super(id, name);
    }


}
