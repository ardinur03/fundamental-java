package Pertemuan5_Kasus1;

public class Restaurant {
	private String[] nama_makanan;// mengubah properti dari public menjadi private kemduian menggunakan fitur
									// bawaaan dari encapsulasi yaitu refacror dan membuat function get & setter
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;

	public Restaurant() {
		setNama_makanan(new String[10]);
		setHarga_makanan(new double[10]);
		setStok(new int[10]);
	}

	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.getNama_makanan()[getId()] = nama;
		this.getHarga_makanan()[getId()] = harga;
		this.getStok()[getId()] = stok;
	}

	public void tampilMenuMakanan() {
		for (int i = 0; i <= getId(); i++) {
			if (!isOutOfStock(i)) {
				System.out.println(
						i + 1 + ". " + getNama_makanan()[i] + " [" + getStok()[i] + "]" + "\tRp. "
								+ getHarga_makanan()[i]);
			}
		}
	}

	public void pesanMakanan(int idMakananTemp, int qtyTemp) {
		idMakananTemp -= 1;
		if (isOutOfStock(idMakananTemp)) {
			System.out.println("Stok " + getNama_makanan()[idMakananTemp] + " Habis");
		} else {
			if (qtyTemp > getStok()[idMakananTemp]) {
				System.out.println("Stok " + getNama_makanan()[idMakananTemp] + " Tidak Mencukupi");
			} else {
				System.out.println("Pesanan " + getNama_makanan()[idMakananTemp] + " Berhasil");
				this.getStok()[idMakananTemp] -= qtyTemp;
			}
		}
	}

	public void kurangiStokMakanan(int stok) {
		if (getStok()[id] != 0) {
			this.getStok()[getId()] -= stok;
		}
	}

	public boolean isOutOfStock(int id) {
		if (getStok()[id] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void nextId() {
		setId(getId() + 1);
	}

	public String[] getNama_makanan() {
		return nama_makanan;
	}

	public void setNama_makanan(String[] nama_makanan) {
		this.nama_makanan = nama_makanan;
	}

	public double[] getHarga_makanan() {
		return harga_makanan;
	}

	public void setHarga_makanan(double[] harga_makanan) {
		this.harga_makanan = harga_makanan;
	}

	public int[] getStok() {
		return stok;
	}

	public void setStok(int[] stok) {
		this.stok = stok;
	}

	public static byte getId() {
		return id;
	}

	public static void setId(int i) {
		Restaurant.id = (byte) i;
	}
}