package Pertemuan5_Kasus2;

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Penjualan penjual = new Penjualan();
		Produk produks = new Produk();

		produks.addMakanan();

		int i = 0, qtyTemp = 1;
		String menu[] = new String[100];
		int harga[] = new int[100];
		int qty[] = new int[100];
		String keputusan = "Y";
		int cek;
		Produk produk;

		do {
			System.out.print("Masukkan Menu Anda : ");
			cek = input.nextInt();
			System.out.print("Masukkan Jumlah Pembelian : ");
			qtyTemp = input.nextInt();

			if (cek <= produks.getProduk().length) {
				produk = produks.getProduk()[cek - 1];
				menu[i] = produk.getNamaProduk();
				harga[i] = (int) produk.getHarga();
				qty[i] = qtyTemp;
			} else {
				System.out.println("Menu Tidak Tersedia");
				break;
			}
			System.out.print("Apakah Anda Ingin Memesan Lagi ? (Y/N) : ");
			keputusan = br.readLine();
			i++;
		} while (keputusan.equals("Y") || keputusan.equals("y"));
		penjual.storePembelian(menu, harga, qty, i);
		// tampikan data produk yang tersisa
		produks.displayMenu(produks.getProduk(), produks.getProduk().length);
	}

}
