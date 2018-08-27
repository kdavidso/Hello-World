import java.util.*;
public class BMI {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height and weight");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		
		double bmi = 703*height/(weight*weight);
		System.out.println("Your bmi is " + bmi);
	}
}