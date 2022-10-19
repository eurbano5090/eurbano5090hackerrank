package coderHacker;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SolutionMonedasConversion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	       

	        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
	        String us = US.format(payment);
	        System.out.println("US: " + us);
	        NumberFormat INDIA = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	        String india = INDIA.format(payment);
	            System.out.println("India: " + india);
	        NumberFormat CHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        
	           String china = CHINA.format(payment);
	           System.out.println("China: " + china);
	        NumberFormat FRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	    
	            String france = FRANCE.format(payment);
	             System.out.println("France: " + france);
	       
	    }
	}


