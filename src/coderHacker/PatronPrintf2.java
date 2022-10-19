package coderHacker;

import java.util.Scanner;

public class PatronPrintf2 {

	    	public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++){
	                for(int j=0; j<=i;j++) {
	            String s1=sc.next();
	                int x=sc.nextInt();
	                
	                String num=String.valueOf(x);
	                int largo=19;
	                
	              if(x<100) { 
	                
	                System.out.printf(s1+"15s",largo,"0"+num +"\n");
	                
	               
	            }else{
	                System.out.printf(s1+"%15s",num+"\n");
	                
	            }
	            }}
	            System.out.println("================================");
	            }
	    }


  

	    


