package edu.upc.dsa.androidcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //@Test
    //public void addition_isCorrect() {assertEquals(4, 2 + 2);}
    CalculatorInterface inter;
    Calculator calc= new Calculator();

    @Before
    public void setup() throws Exception{
        //Initialize testing
        calc.addNumber(3d);
        calc.addNumber(4d);
    }

    @Test
    public double getResult() throws Exception {

    }

}
