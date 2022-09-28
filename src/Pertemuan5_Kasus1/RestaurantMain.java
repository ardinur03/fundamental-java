package Pertemuan5_Kasus1;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isStop = true;
		int verify;
		String cek;
		int idMakanan, qty;

		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-bala", 1_000, 10);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);

		while (isStop) {
			menu.tampilMenuMakanan();
			System.out.print("Masukkan No Menu : ");
			idMakanan = scan.nextInt();
			System.out.print("Masukkan Jumlah Pembelian : ");
			qty = scan.nextInt();
			menu.pesanMakanan(idMakanan, qty);
			System.out.println("Lanjut Pemesanan? y/n");
			cek = scan.next();
			if (cek.equals("n") || cek.equals("N")) {
				isStop = false;
			}
		}

		menu.tampilMenuMakanan();
	}

}
