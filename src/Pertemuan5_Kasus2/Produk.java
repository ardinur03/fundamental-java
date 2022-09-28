package Pertemuan5_Kasus2;

public class Produk {
	private String namaProduk;
	private float harga;
	private int qty;
	Produk[] produks = new Produk[10];

	public void displayMenu(Produk[] produk, int id) {
		System.out.println("Daftar Menu Makanan");
		System.out.println("========================================");
		for (int i = 0; i < id; i++) {
			if (!isOutOfStock(produk, i)) {
				// print header
				if (i == 0) {
					System.out.printf("%-5s %-15s %-6s  %-4s %n", "No", "Nama Produk", "Harga", "Quantity");
					System.out.println("========================================");
				}
				// print data dengan formater agar rapi
				System.out.printf("%-1d. %-15s = Rp. %03d  %3d  %n", i + 1, produk[i].getNamaProduk(),
						(int) produk[i].getHarga(), (int) produk[i].getQty());
			}
		}
	}

	public Produk[] getProduk() {
		return produks;
	}

	public void tambahProduk(String nama_produk, double harga, int qty) {
		setNamaProduk(nama_produk);
		setHarga(harga);
		setHarga(qty);
	}

	public void addMakanan() {
		int id = 0;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Batagor");
		produks[id].setHarga(5000);
		produks[id].setQty(5);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Roti Bakar");
		produks[id].setHarga(12000);
		produks[id].setQty(4);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Indomie+Telor");
		produks[id].setHarga(10000);
		produks[id].setQty(71);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Kwetiaw");
		produks[id].setHarga(12000);
		produks[id].setQty(11);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Nasi Goreng");
		produks[id].setHarga(12000);
		produks[id].setQty(12);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Air Mineral");
		produks[id].setHarga(3000);
		produks[id].setQty(8);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Teh Manis");
		produks[id].setHarga(4000);
		produks[id].setQty(3);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Jus Alpukat");
		produks[id].setHarga(8000);
		produks[id].setQty(2);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Teh Botol");
		produks[id].setHarga(5000);
		produks[id].setQty(1);
		id++;
		produks[id] = new Produk();
		produks[id].setNamaProduk("Kopi");
		produks[id].setHarga(3000);
		produks[id].setQty(7);
		displayMenu(produks, id);
	}

	public Produk getProdukById(int id) {
		id -= 1;
		return produks[id];
	}

	public int hitungQuantity(int qtyTemp) {
		if (qtyTemp == 1) {
			return 1;
		} else {
			return qtyTemp;
		}
	}

	public boolean isOutOfStock(Produk[] produk, int id) {
		if (produk[id].getQty() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int countProduk(Produk[] produk) {
		int count = 0;
		for (int i = 0; i < produk.length; i++) {
			if (produk[i] != null) {
				count++;
			}
		}
		return count;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String nama_produk) {
		this.namaProduk = nama_produk;
	}

	public float getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = (float) harga;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void decreaseQty(int qty) {
		this.qty -= qty;
	}

}