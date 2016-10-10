import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int inputTal = scan.nextInt();
		int randomTal = 1 + rnd.nextInt(100);
		
		if (ifEquals(inputTal, randomTal)) {
			System.out.println("Du gissade rätt! Du gissade på "+inputTal+" och talet var "+randomTal);
		} else {
			if(higher(inputTal, randomTal)) {
				System.out.println("Du svarade för högt. Du gissade på "+inputTal+" och talet var "+randomTal);
			} else {
				System.out.println("Du svarade för lågt. Du gissade på "+inputTal+" och talet var "+randomTal);
			}
		}
	}
	static boolean ifEquals(int inputTal, int randomTal) {
		if(inputTal == randomTal)
			return true;
		else 
			return false;
	}
	
	static boolean higher(int inputTal, int randomTal) {
		if(inputTal > randomTal) {
			return true;
		} else {
			return false;
		}
	}
}
