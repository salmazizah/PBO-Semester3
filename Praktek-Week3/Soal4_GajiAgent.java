package pbopweek3;

import java.util.Scanner;

public class Soal4_GajiAgent {

	public static void main(String[] args) {
		final int gajiPokok = 500000;
		final int hrgItem = 50000;
		
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner(System.in);

		// tampung nilai yang diinput
		System.out.print("Masukkan jumlah penjualan: ");
		int jmlJual = input.nextInt();
		double gaji;
		
		// kondisi untuk menentukan bonus atau potongan
		if(jmlJual > 80) //bonus 35%
			gaji = gajiPokok + ((jmlJual * hrgItem) * 0.35);
		else if(jmlJual >= 40) //bonus 25% 
			gaji = gajiPokok + ((jmlJual * hrgItem) * 0.25);
		else if(jmlJual < 15) //pemotongan
			gaji = gajiPokok - (((15 - jmlJual) * hrgItem) * 0.15);
		else //bonus 10%
			gaji = gajiPokok + ((jmlJual * hrgItem) * 0.10);
		
		System.out.println(String.format("Total gaji : Rp%,d.00", (int) gaji));

		input.close();
	}

}
