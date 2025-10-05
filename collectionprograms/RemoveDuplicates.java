package collectionprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a= {"sanika", "Rutuja", "shreya", "snehal", "shridevi", "sanika", "snehal","Amu"};
		
		HashSet h= new HashSet(Arrays.asList(a));
		LinkedHashSet lh= new LinkedHashSet(h);
		lh.add("mnu");
		lh.add("amu");
		TreeSet t= new TreeSet(lh);
		System.out.println(h);
		System.out.println(lh);
		System.out.println(t);
		
		
	}

}

