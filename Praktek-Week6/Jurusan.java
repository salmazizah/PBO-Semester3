package relasi;

public class Jurusan {
	private int kode;
	private String nama_jurusan;
	
	public Jurusan(int kode, String nama) {
		this.kode = kode;
		this.nama_jurusan = nama;
	}

	public int getKode() {
		return kode;
	}

	public String getNama_jurusan() {
		return nama_jurusan;
	}
}
