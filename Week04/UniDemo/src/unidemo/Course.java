/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

import unidemo.UniPeople.Lecturer;

/**
 *
 * @author afernandez
 */
public class Course {
    protected String code;
    protected String coursework;
    Lecturer teacher = new Lecturer("", 0);
    protected String room;

    public Course(String code, String room) {
        this.code = code;
        this.room = room;
    }

    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCoursework() {
        return coursework;
    }

    public void setCoursework(String coursework) {
        this.coursework = coursework;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    
}
