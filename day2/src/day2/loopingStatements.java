package day2;
import java.lang.Math;

public class loopingStatements {

	public static void main(String []args) {
		//prime numbers
		int n = 99991;
		float nRoot = (float)Math.sqrt(n);
		boolean isPrime = true;
		for(int i = 2; i<nRoot ; i++) {
			if(n%i==0) {
				System.out.println("It is not a prime number");
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("given number is a prime number");
		}
	}
}