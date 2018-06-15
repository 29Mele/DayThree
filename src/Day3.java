import java.util.Scanner;

public class Day3 {
	
   public static void main(String[] args) {
     
	   float number;
	  Scanner scan = new Scanner (System.in );
	   
	  number = scan.nextFloat();
	  scan.close();
	  
	  if (number > 0) {
		  System.out.println("This is postive");
	  }else if (number <0) {
		  System.out.println("This is negative");
		  
		
	  }
	  
   }
   
   

}
