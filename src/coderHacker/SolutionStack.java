package coderHacker;

import java.util.Scanner;

public class SolutionStack {
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            while(input.contains("{}") || input.contains("()") || input.contains("[]") ){
                if(input.contains("{}")) input = input.replace("{}", "");
                if(input.contains("()")) input = input.replace("()", "");
                if(input.contains("[]")) input = input.replace("[]", ""); 
            }
        if(input.length() != 0) System.out.println("false");
        else System.out.println("true");
		}
}
}