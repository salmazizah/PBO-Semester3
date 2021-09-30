package pbopweek3;

import java.util.Scanner;

public class Soal5_BukaTutupJalan {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner(System.in);
		
		String noPlat = null;
		long tanda;
		
		// perulangan untuk menampung no plat
		for(int a=0 ; a<4 ; a++) {
			if(noPlat == null)
				noPlat = input.next();
			else
				noPlat = noPlat + input.next();
		}
		
		// menggabungkan semua plat lalu dioperasikan
		tanda = ((Long.parseLong(noPlat) - 999999) % 5);
		
		// kondisi setelah mendapat sisa hasil bagi
		if(tanda == 0)
			System.out.println("Jalan");
		else
			System.out.println("Berhenti");

		input.close();
	}

}
