
public class ExceptionHandling {
	
	public static void main(String[] args) {
		try {
		int num1 = 50;
		int num2 = 7;
		double sum = num1/num2;
		System.out.println(sum);
		 
	} catch(ArithmeticException e1) {
		  System.out.println("Number can not devide by Zero");
	}
     if (true) {
    	 System.out.println("the process continues");
     }else {
    	 System.out.println("this is else statemnet");
     }
	}
}
