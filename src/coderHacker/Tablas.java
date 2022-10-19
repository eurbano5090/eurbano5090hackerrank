package coderHacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablas {

		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		        int N = Integer.parseInt(bufferedReader.readLine().trim());

		    for(int i=2; i<= N; i++) 
		            for(int j= 1;j <=10;j++) {
		            	if(N==i) {
		                System.out.printf("%d x %d = %d\n",i,j,i*j);
		            	
		    }
            
	}}}
/*
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 */
			


