package soal3;

public class VariableReference{
	public static void main(String[] args){
		String ref;
		try {
			String nama = ref;
			int angka = refClass();
			System.out.println("Nama: " + nama);
		}catch(Exception ex) {
			System.out.println("exception");
		}
		
	}
}
