package Pertemuan5_Kasus2;

public class Penjualan {
	Produk prod = new Produk();

	public void insert(String namaProdukParam, float hargaParam, int qtyParam) {
		prod.setNamaProduk(namaProdukParam);
		prod.setHarga(hargaParam);
		prod.setQty(qtyParam);
	}

	public void printMenu(String[] menu, int[] harga, int[] qty, int i) {
		System.out.println("Menu Yang Anda Pesan : ");
		for (int j = 0; j < i; j++) {
			System.out.println(menu[j] + " " + harga[j] + " x " + qty[j]);
		}
	}

	public void storePembelian(String[] menu, int[] harga, int[] qty, int i) {
		int total = 0;
		printMenu(menu, harga, qty, i);
		for (int j = 0; j < i; j++) {
			total += harga[j] * qty[j];
		}

		// pengurangan qty produk
		for (int j = 0; j < i; j++) {
			prod.setQty(prod.getQty() - qty[j]);
		}
		System.out.println("Total yang harus dibayar : Rp" + total + ".00,-");
	}
}
