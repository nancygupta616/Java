package assignmentQuestions;

import java.util.Scanner;

public class IPproblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
        findClass(n);
	}
	
		public static void findClass(int n){
		Scanner s = new Scanner(System.in);	
		int A=0,B=0,C=0,D=0,E=0;

		
		while(n--> 0) {
			String str = s.next();
		   String bin = str.substring(0,8);
		   int dec = (Integer.parseInt(bin,2));
		   
		  if(dec>=0 && dec<128)
		  {
		      A++;
		  }
		  if(dec>=128 && dec<192)
		  {
		      B++;
		  }
		  if(dec>=192 && dec<224)
		  {
		      C++;
		  }
		  if(dec>=224 && dec<240)
		  {
		      D++;
		  }
		  if(dec>=240 && dec<256)
		  {
		      E++;
		  }
		  
		}
		
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		System.out.println("E = "+E);
		}
		
}