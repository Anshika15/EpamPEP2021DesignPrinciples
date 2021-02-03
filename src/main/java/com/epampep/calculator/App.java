package com.epampep.calculator;

import com.epampep.Math.Arithmetic;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Integer result = null;
    	
    	try {
        	
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.println("Enter two numbers: ");
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	System.out.println("Enter the desired number according to operation specified:");
        	System.out.println("1 - Addition, 2 - Subtraction, 3 - Division, 4 - Multiplication");
        	int operation = sc.nextInt();
        	
        	sc.close();
        	
	    	switch(operation) {
	    		case 1:
	    			result = Arithmetic.add(a, b);
	    			break;
	    		case 2:
	    			result = Arithmetic.subtract(a, b);
	    			break;
	    		case 3:
	    			result = Arithmetic.divison(a, b);
	    			break;
	    		case 4:
	    			result = Arithmetic.multiply(a, b);
	    			break;
	    		default:
	    			throw new Exception("Invalid Operation");
	    	}
    	}
    	catch(ArithmeticException ex) {
    		System.out.println("Cannot divide by Zero.");
    	}
    	catch(InputMismatchException ex) {
    		System.out.println("Invalid Input.");
    	}
    	catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	finally {
    		System.out.println("Result: is " + result);
    	}
    }
}
