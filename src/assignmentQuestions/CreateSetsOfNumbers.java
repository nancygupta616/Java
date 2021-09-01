package assignmentQuestions;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateSetsOfNumbers {

 public static void allSets( int a, int b) { 
         
         ArrayList<Integer> array1 = new ArrayList<>();
         ArrayList<Integer> array2 = new ArrayList<>();
         ArrayList<Integer> array3 = new ArrayList<>();
         ArrayList<Integer> array4 = new ArrayList<>();
            	 
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                array1.add(i);
            }          
    
            if (i % 3 == 0 && i % 5 == 0) {
                array2.add(i);
           }  
            if (i % 3 == 0){
                array3.add(i);
           }   
            if(i % 5 == 0) {
              	 array4.add(i);
              }           
        }
        
        System.out.print("[");
        for(int i=0;i<array1.size();i++){
            System.out.print(array1.get(i)+",");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i=0;i<array2.size();i++){
            System.out.print(array2.get(i)+",");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i=0;i<array3.size();i++){
            System.out.print(array3.get(i)+",");
        }
        System.out.println("]");
        System.out.print("[");
        for(int i=0;i<array4.size();i++){
            System.out.print(array4.get(i)+",");
        }
        System.out.println("]");
        
	}
    
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input a");
	        int a = sc.nextInt();
	        System.out.println("input b");
	        int b = sc.nextInt();
	        
	        allSets(a, b);
	        
	}
}

