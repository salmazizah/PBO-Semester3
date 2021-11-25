package soal3;

import java.util.Scanner;

public class TextField {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan input: ");
		try {
			int integer = input.nextInt();
			System.out.println("Nilai input: " + integer);
		}catch(Exception ex) {
			System.out.println("Input bukan merupakan integer");
		}
		input.close();
	}
}
