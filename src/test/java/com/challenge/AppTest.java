package com.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.challenge.converter.NumericalConverter;

/**
 * Unit Test Class
 * @author Sara Montes
 * @version 1.1
 */
public class AppTest 
{
    private NumericalConverter numericalConverter;

    @Before
    public void setUp() {
        numericalConverter = new NumericalConverter();
    }

    @Test
    public void testIntToRoman() {
        assertEquals("I", numericalConverter.integerToRoman(1));
        assertEquals("IV", numericalConverter.integerToRoman(4));
        assertEquals("IX", numericalConverter.integerToRoman(9));
        assertEquals("LVIII", numericalConverter.integerToRoman(58));
        assertEquals("MCMXCIV", numericalConverter.integerToRoman(1994));
        assertEquals("MMMCMXCIX", numericalConverter.integerToRoman(3999));
        assertEquals("CDXCIX", numericalConverter.integerToRoman(499));   
        assertEquals("XC", numericalConverter.integerToRoman(90));        
        assertEquals("X", numericalConverter.integerToRoman(10));
        assertEquals("III", numericalConverter.integerToRoman(3));
    }

    @Test
    public void testRomanToInt() {
        assertEquals(1, numericalConverter.romanToInteger("I"));
        assertEquals(7, numericalConverter.romanToInteger("VII"));
        assertEquals(12, numericalConverter.romanToInteger("XII"));
        assertEquals(3999, numericalConverter.romanToInteger("MMMCMXCIX"));
        assertEquals(499, numericalConverter.romanToInteger("CDXCIX"));   
        assertEquals(90, numericalConverter.romanToInteger("XC"));       
        assertEquals(10, numericalConverter.romanToInteger("X"));
        assertEquals(3, numericalConverter.romanToInteger("III"));
    }
   
}
