package assignmentQuestions;

import java.util.Scanner;

public class GridProblem {

	public static void help(int [][] arr, String s, int i, int j) {
		
		int n = arr.length;
		int distance = 0;
		
		for(int p = 0; p < s.length(); p++) {			
			char ch = s.charAt(p);	
			
			if(ch == 'W') {
				    if(i == 0) {
				    	break;
				       
				    } else {
				          distance = distance + 1;
				          i = i - 1;
				     }
				}
			
			if(ch == 'S') {
				    if(j == 0) {
				    	break;
				    } else {
				          distance = distance + 1;
				          j = j -1;
				     }
				}
			if(ch == 'E') {
				    if(i == n -1) {
				    	break;    
				    } else {
				          distance = distance + 1;
				          i = i + 1;
				     }
				}
			if(ch == 'N') {
				    if(j == n-1) {
				    	break;
				    	
				    } else {
				          distance = distance + 1;
				          j = j + 1;
				     }
				}
			}
		System.out.println(distance);
			
		}
	
		public static void main(String[] args) {
			
	      Scanner s = new Scanner(System.in);
			String str = s.next();
			int arr[][] = new int[11][11];
			
	       help(arr, str, 0, 0);
			
		}
	}

