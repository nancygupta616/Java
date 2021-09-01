package assignmentQuestions;

import java.util.Scanner;

public class ReverseRowsAndColumns {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();		   
       int[][] arr = new int[n][n];
       
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    String str = sc.next();    
        if(str.equals("row")) {
            row(arr);
         } else {
             column(arr, n,n);
     	   }
      }
	
	// reverse row		
    public static void row(int arr[][]) {
    	
    for (int i = arr.length - 1; i >=0; i--) {
       for (int j = 0; j < arr.length ; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
}

//	 reverse column
	public static void column(int arr[][], int M, int N) {
	  
	    // Traverse each row of arr[][]
		
	    for (int i = 0; i < M; i++) {
	  
	        // Initialise start and end index
	        int start = 0;
	        int end = N - 1;
	  
	        // Till start < end, swap the element
	        // at start and end index
	        while (start < end) {
	  
	            // Swap the element
	            int temp = arr[i][start];
	            arr[i][start] = arr[i][end];
	            arr[i][end] = temp;
	  
	            // Increment start and decrement
	            // end for next pair of swapping
	            start++;
	            end--;
	        }
	    }
	  
	    // Print the arr[][] after
	    // reversing every row
	    for (int i = 0; i < M; i++) {
	        for (int j = 0; j < N; j++) {
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	  

}
