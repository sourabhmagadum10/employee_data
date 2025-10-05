package hierachicalinheritance;

public class MainExection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c= new Cow();
		c.makeSound();
		Animal c1= new Dog();
		Dog d= new Dog();
		c1.makeSound();
		c1= new Cat();
		c1.makeSound();
		
		Animal a= d;
		Dog d2= (Dog)a;
		
	}

}
