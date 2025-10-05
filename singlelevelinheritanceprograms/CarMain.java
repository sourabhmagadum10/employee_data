package singlelevelinheritanceprograms;


public class CarMain {

	public static void main(String[] args) {
		FourWheelrCar f= new  FourWheelrCar();
//		Car f1= new Car();
		Car s= f;
		
//		f1.show();
		
		Car e= new FourWheelrCar();
		
		FourWheelrCar c= (FourWheelrCar) e;
		
//		FourWheelrCar f2= (FourWheelrCar)f1;
		System.out.println(c instanceof Car );
		
		
		
		
//		FourWheelrCar fc= (FourWheelrCar)f1;
//		System.out.println(f3 instanceof Car );
		
//		System.out.println(fc.brand);
		
		

	}

}