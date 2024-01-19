package com.challenge;

import java.util.Scanner;

import com.challenge.converter.NumericalConverter;

/**
 * Main Class
 * @author Sara Montes
 * @version 1.0
 */ 
public class App 
{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        NumericalConverter romanConverter = new NumericalConverter();
        System.out.print("Enter an integer between 1 and 3999: ");
        int number = scanner.nextInt();
        String romanNumeral = romanConverter.integerToRoman(number);
        System.out.println("Roman Number for " + number + ": " + romanNumeral);
	}

}
