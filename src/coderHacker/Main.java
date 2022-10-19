package coderHacker;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ingrese un numero");
	     int N = scanner.nextInt();
	     
	 
		
        /*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.*/
       if(N%2!=0 &&N>1&& N<5){
            System.out.println("Weird");
        }
        else if(2<N && N<5 && N%3!=0){
            System.out.println("Not Weird");
        }
            
        else if (N%2==0 && N>6 && N<=20){
            
            System.out.println("Weird");
            
         }else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }
         else {
             System.out.println("Weird");
         }

        scanner.close();
        } 
          
	


}
