import java.text.NumberFormat;

public class Sep29Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat p = NumberFormat.getPercentInstance();
		NumberFormat c = NumberFormat.getCurrencyInstance();
		
		double OIL_PRICE = 2.99;		
		double OIL_INCREASE = .1;
		
		System.out.println("Oil price of Kentucky is: " +c.format(OIL_PRICE));
		System.out.println("The oil price increased by " +p.format(OIL_INCREASE) +" than last year");

	}

}
