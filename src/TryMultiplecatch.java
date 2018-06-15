
public class TryMultiplecatch {
	public static void main(String[] args) {
		int num[] = {23,45,56,67,88,89};
		
		try {
			num[4] = 20/1;
			
		} catch (ArithmeticException e) {
			System.out.println("An ArthmeticException Occir");
			
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bound error");
		}
		System.out.print("End of the process");
		System.out.println(num[4]);
	}


}
