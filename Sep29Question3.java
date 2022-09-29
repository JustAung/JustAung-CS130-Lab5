import java.util.Random;

public class Sep29Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
	
		int randNum = generator.nextInt(16) +5;
		System.out.println("The random number in the range 5-20 is:" +randNum);

	}

}
