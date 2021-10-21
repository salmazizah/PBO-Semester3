package relasi;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Siswa s1 = new Siswa("Ashfiya Nabila", 2101510005);
		Siswa s2 = new Siswa("Hilma Rosyidah", 2101510017);
		
		List<Siswa> kelasA = new ArrayList<Siswa>();
		kelasA.add(s1);
		kelasA.add(s2);
		
		Kelas kelas = new Kelas("X-A", "Sri Fatimah", kelasA);
		System.out.println("Kelas: " + kelas.getKls() + "|| Wali Kelas: " + kelas.getWali());
		System.out.println("-------------------------------------");
		List<Siswa> Kls = kelas.getSiswa();
		for(Siswa sw : Kls){
			System.out.println("- " + sw.getNama() + " (NIS: " + sw.getNis() + ")");
		}
		
		Jurusan jurusan = new Jurusan(15, "Multimedia");
		System.out.println();
		System.out.println("Nama Jurusan: " + jurusan.getNama_jurusan() + " (Kode: " + jurusan.getKode() + ")");
		
	}

}
