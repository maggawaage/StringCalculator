package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test //1
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test //2
    public void testOneNumber() {
    	assertEquals(1, Calculator.add("1"));
    }

    @Test //3
    public void testTwoNumber() {
    	assertEquals(3, Calculator.add("1,2"));
    }

    @Test //4
    public void testMultiplesNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test //5
    public void testNewLinesBetweenNumbers(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
 }
