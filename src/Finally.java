import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int num1= scan.nextInt();
			int num2 = num1/0;
			System.out.println(num2);
		}
		catch(ArithmeticException e1) {
			System.out.println("YOu cannot devide number by Zero");
		}
		finally {
		System.out.println("this is final block");
		}
	}

}
