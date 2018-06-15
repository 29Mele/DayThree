

public class New {
	public static void main(String[] args) {
		System.out.println("Check the bonus duration");
		CheckEligibility(13,99);
	}
	static void CheckEligibility (int EmpId, int empNum) {
  if(EmpId < 12&& empNum <40)	{
	  throw new ArithmeticException("Not eligible for bonus");
  }
  else {
	  System.out.println("Eligible for Bonus");
  }
  }

}
