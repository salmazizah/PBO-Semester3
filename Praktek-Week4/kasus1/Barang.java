package kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	// method getter untuk mengambil nilai stok
	public int getStok() {
		return stok;
	}

	// method untuk penambahan stok
	public void tambahStok(int jml) {
		this.stok = stok + jml;
	}

	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
}
