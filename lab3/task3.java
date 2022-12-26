package week3;


public class task3 {


	public static void main( String[] args) {

	int counter = 1;
	
	System.out.println("enter your name: ");
	String name = "emir";
	int len = name.length();
	for(int i=0; i<len; i++, counter++) {
		System.out.println(counter+". character  "+name.charAt(i));
		}	
	}
}
