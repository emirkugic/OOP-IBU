package week4;

import java.util.ArrayList;

public class Main {
	
	public static void combine(ArrayList<Integer> a, ArrayList<Integer> b) {
		a.addAll(b);
	}
	

	public static void main( String[] args) {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list1.add(4);
	list1.add(3);

	list2.add(5);
	list2.add(10);
	list2.add(7);

	combine(list1, list2);

	System.out.println(list1);

	System.out.println(list2);
	
	
	}
}
