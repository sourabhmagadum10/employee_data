package conditionalstatements;

public class IfElsePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		checkNum(-1);
//		checkLeepYear(2002);
//		largestNumber(10, 20, 1);
//		checkNumDivisible(10);
//		stringContains("Java is language");
//		convertClock(13);
//		cal(10);
		calculator(2);
	}
	
	public static String checkNum(int a) {
		if(a>0) {
			return "Positve number";
		}
		else {
			return "Negative number";
		}
	}
	
	public static void checkEvenOdd(int a) {
		if(a % 2 == 1)
			System.out.println("Odd number");
		else
			System.out.println("Even number");
	}
	
	public static void largestNumber(int a, int b, int c) {
		if(a>b && a>c)
			System.out.println("a is largest " +a);
		else if(b>c) {
			System.out.println("b is largest " +b);
		}
		else
			System.out.println("C is largest "+c);
	}
	
	public static void checkLeepYear(int year) {
		if(year % 400== 0 && year %4 ==0) {
			System.out.println("leep year");
		}
		else
			System.out.println("not an leep year");
	}
	
	public static void checkNumDivisible(int num) {
		if(num % 3 == 0 && num % 5== 0) {
			System.out.println("divisible");
		}
		else
			System.out.println("not divisible");
	}
	
	public static void stringContains(String str) {
		String str1= str.toLowerCase(); 
		if(str1.contains("java")) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static void convertClock(int time) {
		if(time> 24) {
			System.out.println("enter a valid time");
		}
		else{
			if(time>12) {
				int a= time-12;
				System.out.println("12 hours Clock time: "+a);
			}
		}
	}
	
	public static void cal(int x) {
		int num1= 20; 
		int num2= 10;		
		
	}
	
	public static void calculator(int ch) {
		int num1= 10; 
		int num2= 2;
		switch(ch) {
		case 1:{
			int a= num1+num2;
			System.out.println("Addition: "+a);
		}break;
		case 2:{
			int a= num1-num2;
			System.out.println("Substration : "+a);
			break;
		}
		case 3:{
			int a= num1*num2;
			System.out.println("Multiplication: "+a);
		}break;
		case 4:{
			int a= num1/num2;
			System.out.println("Division "+a);
		}break;
		case 5:{
			int a= num1%num2;
			System.out.println("remainder: "+a);
		}break;
		default: System.out.println("Enter a valid choice");
		}
		
	}

}
