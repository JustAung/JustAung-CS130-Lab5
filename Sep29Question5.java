import java.util.Scanner;
import java.text.DecimalFormat;


public class Sep29Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first x coordinate: ");
		double x1 = scan.nextDouble();
		
		System.out.println("Enter the first y coordinate: ");
		double y1 = scan.nextDouble();
		
		System.out.println("Enter the second x coordinate: ");
		double x2 = scan.nextDouble();
		
		System.out.println("Enter the second y coordinate: ");
		double y2 = scan.nextDouble();
		
		double point1 =(x2 - x1);
		double point2 = (y2 - y1);
		
		double square1 = Math.pow(point1, 2);
		double square2 = Math.pow(point2, 2);
		
		double d = Math.sqrt(square1 + square2);
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		System.out.println("The distance between points "+ square1 + " and " +square2 + " is " +format1.format(d));

	}

}
