package pbopweek3;

import java.util.Scanner;

public class Soal2_InputOutput {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner(System.in);
		
		// jika jumlah input akan disesuaikan
		//int jumlah = input.nextInt();
		
		String[] kata = new String[3];
		int[] angka = new int[3];
		
		// perulangan untuk menampung input keyboard
		for(int a=0 ; a<3 ; a++) {
			for(int b=0 ; b<2 ; b++) {
		        if(input.hasNextInt()) {
		        	angka[a] = input.nextInt();
		        }else {
		        	kata[a] = input.next();
		        }
			}
		}
		
		System.out.println("================================");
		// perulangan untuk menampilkan data yang sudah diinput dengan format
		for(int c=0 ; c<3 ; c++) {
			// kondisi agar angka yang muncul 3 digit
			if(angka[c]<100) {
				System.out.printf("%-15s 0%d \n", kata[c], angka[c]);
			}else {
				System.out.printf("%-15s %d \n", kata[c], angka[c]);
			}
		}
		System.out.println("================================");
		
		input.close();
	}

}