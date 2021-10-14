package kasus2;

public class RestaurantMain {
	static void tambahMenu(Restaurant menu) {
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
	}
	
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		tambahMenu(menu);
		
		menu.tampilMenuMakanan();
		menu.pesanMenu("Molen", (byte) 5);
		System.out.println();
		menu.tampilMenuMakanan();
	}
}
