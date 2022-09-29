import java.util.Scanner;
import java.text.DecimalFormat;

public class Sep29Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side A:");
		int a = scan.nextInt();
		
		System.out.println("Enter the length of side B:");
		int b = scan.nextInt();

		System.out.println("Enter the length of side C:");
		int c = scan.nextInt();
		
		int s = a+b+c/2;
		System.out.println("The s is: "+s);
		
		int area1 = s-a;
		int area2 = s-b;
		int area3 = s-c;
		int area4 = area1*area2*area3;
		int area5 = s*area4;
		double area = Math.sqrt(area5);
		DecimalFormat format1 = new DecimalFormat("0.##");
		System.out.println("The formatted result is: "+format1.format(area));

		

	}

}
