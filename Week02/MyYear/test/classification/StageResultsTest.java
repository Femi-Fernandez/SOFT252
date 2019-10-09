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
        //fail("Test not yet implemented");
        System.out.println("Testing calculateAverageSoFar");
        
        //test with no credits and no marks
        assertEquals("empty", 0.0, empty.calculateAverageSoFar(), 0.0);
        
        //test with 120 credits at 50%
        assertEquals("full at 50%", 50.0, full.calculateAverageSoFar(), 0.0);
        
        //test with 120 credits at 100%
        full.resetValues();
        full.addModuleMark(120, 100.0);
        assertEquals("full at 100%", 100.0, full.calculateAverageSoFar(), 0.0);
        
        //test with 120 credits at 43.92%
        full.resetValues();
        full.addModuleMark(120, 43.92);
        assertEquals("full at 43.92%", 43.92, full.calculateAverageSoFar(), 0.0);
        
        //test with 60 credits at 50% (halfFull)
        assertEquals("halfFull at 50%", 50.0, halfFull.calculateAverageSoFar(), 0.0);
        
        //test with 60 credits at 100%
        halfFull.resetValues();
        halfFull.addModuleMark(60, 100);
        assertEquals("half full at 100%", 100.0, halfFull.calculateAverageSoFar(), 0.0);
        
        //test with 60 credits at 64.77%
        halfFull.resetValues();
        halfFull.addModuleMark(60, 64.77);
        assertEquals("half full at 64.77%", 64.77, halfFull.calculateAverageSoFar(), 0.0);
    }

    @Test
    public void testPredictClass() {
        //fail("Test not yet implemented");
        System.out.println("testing predictClass");

        // Array to hold the stage 3 marks
        double[] marks = {0.00, 50.00, 50.00, 100.00, 39.99, 40.0,
              49.99, 50.0, 59.99, 60.0, 69.99, 70.0, 99.99, 35.67,
              44.22, 56.39, 64.00, 76.80};
        // Array of corresponding classifications with no stage 2 marks
        String[] expResult1 = {"No marks!", "Lower 2nd",
              "Lower 2nd", "1st", "FAIL", "3rd", "3rd", "Lower 2nd",
              "Lower 2nd", "Upper 2nd", "Upper 2nd", "1st", "1st",
              "FAIL", "3rd", "Lower 2nd", "Upper 2nd", "1st"};

        // Run tests with no stage 2 average
        for (int count = 0; count < marks.length; count++) {
            full.resetValues();
            full.addModuleMark(120, marks[count]);
            assertEquals("120 credits, mark = " + marks[count], expResult1[count],
            full.predictClass());
        } 
        
        double[] stage2Marks = {0.0, 50.0, 52.03, 91.0, 44.79, 42.86, 50.83, 
                54.47, 56.34, 68.77, 69.99, 63.57, 99.99, 36.57, 47.84, 62.57,
                64.30, 78.66};
        String[] expResult2 = {"No marks!", "Lower 2nd", "Lower 2nd", "1st", 
                "3rd", "3rd", "Lower 2nd", "Lower 2nd", "Lower 2nd", "Upper 2nd", 
                "Upper 2nd", "Upper 2nd", "1st", "FAIL", "3rd", "Upper 2nd", 
                "Upper 2nd", "1st"};
        for (int i = 0; i < stage2Marks.length; i++) {
            full.resetValues();
            full.addModuleMark(120, stage2Marks[i]);
            assertEquals("120 credits, mark = " + stage2Marks[i], expResult2[i],
            full.predictClass());
        }
        
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
