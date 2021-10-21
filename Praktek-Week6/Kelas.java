package relasi;

import java.util.*;

public class Kelas {
	private String kls;
	private String wali;
	private List <Siswa> Siswa;
	
	public Kelas(String kls, String wali, List <Siswa> Siswa) {
		this.kls = kls;
		this.wali = wali;
		this.Siswa = Siswa;
	}

	public String getKls() {
		return kls;
	}

	public String getWali() {
		return wali;
	}

	public List<Siswa> getSiswa() {
		return Siswa;
	}
}
