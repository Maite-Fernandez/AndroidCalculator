package edu.upc.dsa.androidcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    private Calculator calc;

    @Before
    public void setup() throws Exception {
        //Initialize testing
        calc= new Calculator();

    }

    @Test
    public void testSubstract() throws Exception {
        calc.addNumber(5.0);
        calc.addNumber(10.0);
        calc.addOperation(7);
        assertEquals(-5, calc.getResult(), 0);
    }

    @Test
    public void testSum() throws Exception {
        calc.deleteAll();
        calc.addNumber(10.0);
        calc.addNumber(5.0);
        calc.addOperation(6);
        assertEquals(15, calc.getResult(), 0);
    }

    @Test
    public void testDivide() throws Exception {
        calc.deleteAll();
        calc.addNumber(10.0);
        calc.addNumber(5.0);
        calc.addOperation(5);
        assertEquals(2, calc.getResult(), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        calc.deleteAll();
        calc.addNumber(10.0);
        calc.addNumber(5.0);
        calc.addOperation(4);
        assertEquals(50, calc.getResult(), 0);
    }

    @Test
    public void testTan() throws Exception {
        calc.deleteAll();
        calc.addNumber(45.0);
        calc.addOperation(3);
        assertEquals(1, calc.getResult(), 0.000001);
    }

    @Test
    public void testCos() throws Exception {
        calc.deleteAll();
        calc.addNumber(90.0);
        calc.addOperation(2);
        assertEquals(0, calc.getResult(), 0.000001);
    }

    @Test
    public void testSin() throws Exception {
        calc.deleteAll();
        calc.addNumber(90.0);
        calc.addOperation(1);
        assertEquals(1, calc.getResult(), 0.000001);
    }

    @Test
    public void testChain() throws Exception {
        calc.deleteAll();
        calc.addNumber(2.0);
        calc.addNumber(3.0);
        calc.addNumber(3.0);
        calc.addOperation(6);
        calc.addOperation(4);

        assertEquals(11, calc.getResult(), 0);
    }
}


