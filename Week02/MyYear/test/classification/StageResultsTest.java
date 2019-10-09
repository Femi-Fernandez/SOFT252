/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author afernandez
 */
public class StageResultsTest {
    
    private StageResults empty;     //will have no credits and no marks
    private StageResults full;      //will have 120 credits and marks
    private StageResults halfFull;  //will have 60 credits and some marks
    
    public StageResultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //empty - object that starts with default values
        empty = new StageResults();
        
        //full - object with 120 credits-worth of marks but no
        //initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);
        
        //halfFull - object with 60 credits-worth of marks and
        //no initial stage2Average
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testAddModuleMark() {        
        //fail("Test not yet implemented");
        System.out.println("Testing AddModuleMark");
        
        //test for 10 credit module
        empty.addModuleMark(10, 50.0);
        double expMarkValue = 50.0;  
        assertEquals("marks", expMarkValue, empty.getTotalMarks(), 50.0);
        empty.resetValues();
        
        //test for 20 credit module
        empty.addModuleMark(20, 50.0);
        expMarkValue = 100.0;
        assertEquals("marks", expMarkValue, empty.getTotalMarks(), 100.0);
        empty.resetValues();
        
        //test for 40 credit module
        empty.addModuleMark(40, 50.0);
        expMarkValue = 200;
        assertEquals("marks", expMarkValue, empty.getTotalMarks(), 200.0);
        empty.resetValues();


    }

    @Test
    public void testCalculateAverageSoFar() {
        fail("Test not yet implemented");
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented");
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testIsComplete() {
       //fail("Test not yet implemented");
       System.out.println("Testing isComplete");
       
       //check that the empty project is 'not complete'
       assertFalse("empty object", empty.isComplete());
       
       //check that the full project is ' complete'
       assertTrue("full object", full.isComplete());
       
       //check that the halfFull project is not complete'
       assertFalse("halfFull object", halfFull.isComplete());
    }

    @Test
    public void testResetValues() {
        //fail("Test not yet implemented");
        System.out.println("Testing resetValues");
        
        //set the state of the 'full' object to zeroes
        full.resetValues();
        
        //set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;
        
        //check each attribute to test the reset worked
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);
        
        //put the full object back to its original state
        full.addModuleMark(120, 50.0);
    }
    
}
