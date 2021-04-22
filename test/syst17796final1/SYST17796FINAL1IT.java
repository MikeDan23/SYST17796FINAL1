/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796final1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mic_d
 */
public class SYST17796FINAL1IT {
    
    public SYST17796FINAL1IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalculateNet method, of class SYST17796FINAL1.
     */
    @Test
    public void testCalculateNet() {
        int hours = 8;
        int rate = 14;
        int tax = 15;
        SYST17796FINAL1 test = new SYST17796FINAL1();
        int result = test.CalculateNet(hours, rate, tax);
        assertEquals(91, result);
    }
    
}
