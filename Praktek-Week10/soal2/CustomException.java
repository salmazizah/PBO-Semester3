package soal2;

import java.util.Scanner;

public class CustomException {
	// exception method 
	// untuk memeriksa apakah input merupakan hexadesimal
	public static int hexaDecCheck(String hexa) {
	    try {
	        return Integer.parseInt(hexa, 16);
	    } catch (NumberFormatException ex) {
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan bilangan: ");
		String hexaDec = input.next();
		input.close();
		
		int hexaCheck = hexaDecCheck(hexaDec);
		if(hexaCheck != 0) { // jika input merupakan hexadesimal
			System.out.println(hexaDec + " merupakan bilangan hexadesimal");
			System.out.println("Nilai desimal: " + hexaCheck);
		}else { // jika input bukan merupakan hexadesimal
			System.out.println(hexaDec + " bukan merupakan bilangan hexadesimal");
		}
	}
}
