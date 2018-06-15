
public class NestedTrycatchBlock {
	//main try-block
	public static void main(String [] args) {
	try {
		//try-block2
		try {
			//try-block3
			try {
				int arr[]= {12,13,14,15};
				System.out.println(arr[12]);
				
			}catch (ArithmeticException e1) {
				System.out.println("ArthmeticExcepton");
				System.out.println("Handled in try-block3");
			}
		} catch (ArithmeticException e2){
			System.out.print("Arthmetic EXception");
			System.out.println("Handled in try-blocks2");
		}
	} catch(ArithmeticException e3){
		System.out.print("Arthmeic Exception");
	    System.out.println("handled in main try-block3");
	}


	catch(ArrayIndexOutOfBoundsException e4){
		System.out.print("ArrayIndexoutof BoundsException");
		System.out.println("handled in main try-block");
	} catch (Exception e5) {
		System.out.print("Exception");
		System.out.println("handled in main try-block");
					
			}
			}
		
	}
	

