import java.util.Scanner;

public class withscanner {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
          int count = scan.nextInt();	  
		    
			int num1= 0;
			int num2= 1;
			
			for(int i = 1; i<=count; i++) {
				System.out.println(num1 + "");
				
				int sumofnumber = num1 + num2;
				 num1 = num2;
				 num2= sumofnumber;
			}
		
		
	  }
}
