package com.pbopweek2;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		
		System.out.print("Masukkan string1: ");
		String string1 = string.nextLine();
		System.out.print("Masukkan string2: ");
		String string2 = string.nextLine();

		//menjumlahkan panjang kedua string
		System.out.println(string1.length() + string2.length());
		
		//leksikografis
		int compare = string1.compareTo(string2);
		if(compare < 0) {
			System.out.println("Yes");
		}else if(compare == 0) {
			System.out.println("String sama");
		}else if(compare > 0) {
			System.out.println("No");
		}
		
		//untuk mengambil substring dari string yang ada
		String split1 = string1.substring(0, 1);
		String split2 = string2.substring(0, 1);

		//menggabungkan string
		String concatWord1 = split1.toUpperCase() + string1.substring(1);
		String concatWord2 = split2.toUpperCase() + string2.substring(1);
		String concatString = concatWord1 + " " + concatWord2;		
		System.out.println(concatString);

	}

}
