package pbopweek3;

import java.util.Scanner;

public class Soal3_Berhitung {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner(System.in);
		
		// tampung nilai yang diinput
		int A = input.nextInt();
		String operator = input.next();
		int B = input.nextInt();
		
		// kondisi untuk menentukan operasi
		if((operator.compareTo("*")) == 0)
			System.out.println(A * B);
		else if((operator.compareTo("/")) == 0)
			System.out.println(A / B);
		else if((operator.compareTo("+")) == 0)
			System.out.println(A + B);
		else if((operator.compareTo("-")) == 0)
			System.out.println(A - B);
		else if((operator.compareTo("%")) == 0)
			System.out.println(A % B);
		else
			System.out.println("operasi tidak ditemukan");
		
		input.close();
	}

}
