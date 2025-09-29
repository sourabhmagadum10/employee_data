package conditionalstatements;

public class TernaryOperatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEvenOdd(10);
		largeNumberAmongThree(100, 20, 11);
	}
	
	public static void checkEvenOdd(int num) {
		String a=(num%2 == 0) ? "even "+num : "odd " +num;
		System.out.println(a);
	}
	
	public static void checkNumPosNeg(int num) {
		String res= (num>  0)? "number is posituve "+num : "Number is negative "+num;
	}
	
	public static void largeNumberAmongThree(int num1, int num2, int num3) {
		int res= (num1>num2 && num1>num3)?num1:(num2>num3)?  num2: num3;
		
		System.out.println(res);
	}

}
