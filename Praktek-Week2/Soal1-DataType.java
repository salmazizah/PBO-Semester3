/**
 * 
 * 
 * 
 */

package com.pbopweek2;

import java.util.Scanner;

public class dataType {

	public static void main(String[] args) {
		// objek untuk menampung input dari keyboard
		Scanner angka = new Scanner(System.in);
		
		// nilai percobaan dari input dimasukkan ke variable T
		System.out.print("Masukkan jumlah percobaan: ");
        int T = angka.nextInt();
        
        // perulangan sesuai input
        for(int i=1; i<=T; i++)
        {
        	System.out.println("Percobaan: " + i + "/" + T);
            try
            {
            	// variable n menampung angka inputan yang akan dikategorikan
        		System.out.print("Masukkan angka: ");
                long n = angka.nextLong();
                
                // pengkategorian angka
                System.out.println(n  +" can be fitted in:");
                if(n >= -128 && n <= 127) {
                	System.out.println("* byte");
                }
                if(n >= -32768 && n <= 32767) {
                	System.out.println("* short");
                }
                if(n >= -2147483648 && n <= 2147483647) {
                	System.out.println("* int");
                }
                if(n >= -9223372036854775808L && n <= 9223372036854775807L) {
                	System.out.println("* long");
                }
            }
            catch(Exception e)
            {
            	// jika angka tidak masuk kategori diatas
                System.out.println(angka.next()+" can't be fitted anywhere.");
            }

        }
	}

}
