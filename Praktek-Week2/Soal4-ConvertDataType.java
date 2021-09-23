package com.pbopweek2;

public class ConvertDataType {

	static short methodOne(long l){
		int i = (int) l; // konversi long menjadi integer
		return (short)i; // konversi integer menjadi short
	}
	
	public static void main(String[] args){
		double d = 10.25;
		float f = (float) d; // konversi double menjadi float
		// konversi float menjadi long, lalu masuk ke methodOne dikembalikan sebagai short
		byte b = (byte) methodOne((long) f); // konversi short menjadi byte
		System.out.println("d = " + d);
		System.out.println("f = " + f);
		System.out.println("b = " + b);
	}
}
