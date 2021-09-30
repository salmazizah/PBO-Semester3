package pbopweek3;

import java.util.Scanner;

public class Soal1_InputOutput {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner input = new Scanner (System.in);
		
		// var menampung input kalimat
		String kalimat = input.nextLine();
		int jmlHuruf = kalimat.length();
		
		// perulangan untuk menghitung jumlah kata mulai dari huruf pertama
		int jmlKata = 1;
        for (int a=0; a<jmlHuruf; a++) {
            char h = kalimat.charAt(a);
            if (h == ' ' || h == '!' || h == ',' || h == '?' || h == '.' || h == '_' || h == '\'' || h == '@') {
            	jmlKata++;
            }
        }
        System.out.println(jmlKata);
        
        // perulangan untuk mencetak kata per kata
		String kata = "";
	    for(int a=0; a<jmlHuruf; a++){
	        char h = kalimat.charAt(a);
	    	if(h == ' ' || h == '!' || h == ',' || h == '?' || h == '.' || h == '_' || h == '\'' || h == '@') {
	    		System.out.println(kata);
	    		kata = "";
	    	}
	        else{
	        	kata = kata + kalimat.charAt(a);
	        }
	    }
	    System.out.println(kata);

		input.close();
	}
}
