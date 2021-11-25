package soal3;

import java.io.FileInputStream;

public class File {
	public static void main(String[] args) {
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("namaFile.txt");
		}catch(Exception ex) {
			System.out.println("File tidak ditemukan");
		}
	}
}
