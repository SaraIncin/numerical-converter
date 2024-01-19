package com.challenge.converter;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to convert numbers 
 * @author Sara Montes
 * @version 1.1
 */
public class NumericalConverter {

    /**
     * Convert a integer in a roman
     * @param num number to be converted
     * @return roman number 
     */
    public String integerToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Input should between 1 and 3999.");
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romanNumbers[i]);
            }
        }

        return result.toString();
    }

    /**
     * Convert a roman number in a integer
     * @param num roman number to be converted
     * @return integer number
     */
    public int romanToInteger(String num) {

        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentVal = romanNumbers.get(num.charAt(i));

            if (i < num.length() - 1) {
                int nextVal = romanNumbers.get(num.charAt(i + 1));
                if (currentVal < nextVal) {
                    result += (nextVal - currentVal);
                    i++;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}
