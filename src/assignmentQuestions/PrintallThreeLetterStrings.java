package assignmentQuestions;

import java.util.Scanner;

public class PrintallThreeLetterStrings {
	
		public static void printCombinations(String str,String output) {
			
	        if(output.length()== 3){
	            System.out.println(output);
	            return;
	        }
	        for(int i=0; i<str.length(); i++)
	            printCombinations(str,output+str.charAt(i));
	    }
		 
	// Driver Code
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    String str = sc.nextLine();
		    String output = "";
		    
		    for(int i=0; i<str.length(); i++) {
		    	
		    printCombinations(str,output+str.charAt(i));
		    
		}
		}
		
		}


