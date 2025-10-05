package coreconcepts;

public class StaticClassMember {

	int a=10;
	String name= "Snehal";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClassMember c= new StaticClassMember();
		
		c.demo();
	}
	static int a1= 11;
	static String name1 = "snehu";
	
	static {
		a1=10;
//		name= "Sanika";
		name1="sanu";
		int b= 10;
	}
	
	public static void demo1() {
		int a1=10;
		System.out.println(StaticClassMember.a1);
	}
	
	public void demo() {
		int a=20;
		System.out.println(this.a);
		System.out.println(a);
	}
	
	

}
