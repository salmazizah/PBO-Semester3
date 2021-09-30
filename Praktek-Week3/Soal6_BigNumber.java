package pbopweek3;

import java.util.Scanner;
import java.math.BigInteger;

public class Soal6_BigNumber {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();

		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);		

		System.out.println(A.add(B));
		System.out.println(A.multiply(B));		

		input.close();
	}

}
