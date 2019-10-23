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
public abstract class UniPeople {
    protected Course course;
    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniPeople(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
