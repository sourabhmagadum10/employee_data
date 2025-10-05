package collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		Integer a3 []= {10, 20, 40, 30 , 50};
		ArrayList a2= new  ArrayList(Arrays.asList(a3));//it work only presented data is Non primitive type
		System.out.println(a2);
		
		int arr[]= {20, 1, 1, 9, 45, 9, 64,20, 40, 10};
		ArrayList al= new ArrayList();
		for(int num : arr) {
			al.add(num);
		}
		System.out.println("    fdfghjkf   "+al);
		
		LinkedHashSet e= new LinkedHashSet(al);
		System.out.println(e);
		

		ArrayList a= new  ArrayList();
		a.add(10);
		a.add(20);
		a.add("sanika");
		a.add("Sourabh");
//		System.out.println(a);
		
		ArrayList a1= new ArrayList<>(3);//Initail capcity menas after filling it intial capcity it creates new arrylist with larger capcity
		
		a1.add(20);
		a1.add("Sourabh");
		a1.add("sanika");
		a1.add('s');
		a1.add(12.5);
		a1.add(null);
		int s= a1.size();
//		System.out.println(a.size()+" jh"+s);
//		System.out.println(a1);
//		a.retainAll(a1);//return duplicate elements and remove elements thoes are not present in both collection
//		System.out.println(a);
		
		System.out.println(a.contains("sanika"));//its case sensetive
		System.out.println(a.containsAll(a1));
//		a.clear();
//		System.out.println(a);
		
		 System.out.println(a.get(2));
		 a.set(0, a1);
//		 System.out.println(a);
		 
		 System.out.println(a.indexOf("Sourabh"));
		 
//		 int a2= a.lastIndexOf("Sourabh");
		 
		 System.out.println(a2);
		 
		
	}

}
