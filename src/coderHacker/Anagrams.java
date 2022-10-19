package coderHacker;

import java.util.Scanner;

public class Anagrams {

	 
		   @SuppressWarnings("unused")
		static boolean isAnagram(String a, String b) {
		         a=a.toLowerCase();
		         b= b.toLowerCase();
	/*	       if(a.length()==b.length()){
		        for(int i=0;i<a.length();i++){
		            if(!b.contains(String.valueOf(a.charAt(i)))){
		                return false;
		        }
		        else {
		           return true;
		        }}}
		           return false;
		          
		        }*/
	       char [] a1=a.toCharArray();
	       char [] a2=b.toCharArray();
	       java.util.Arrays.sort(a1);
	        java.util.Arrays.sort(a2);

	        return java.util.Arrays.equals(a1, a2);
	            
	       
		   }


	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}