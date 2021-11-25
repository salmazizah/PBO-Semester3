package soal3;

public class Array {
	public static void main(String[] args) {
		int array[] = {1, 5, 10};
		System.out.println("Nilai array");
		try {
			for(int a = 0;a < 5;a++) {
				System.out.println("index " + a + ": " + array[a]);
			}			
		}
		catch(Exception ex){
			System.out.println("Index array melebihi seharusnya");
			System.out.println("Panjang array: " + array.length);
		}
	}
}
