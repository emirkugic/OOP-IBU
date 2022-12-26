package week3;

public class task1 {

	public static double average(int num1, int num2, int num3, int num4) {
		double avg=(num1+num2+num3+num4)/(double)4;
		return avg;
	}
	
	public static void main( String[] args) {
	
	double answer = average(4,3,6,1);
	System.out.println(answer);
	
	
	}
}
