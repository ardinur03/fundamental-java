package Pertemuan5_Kasus1;

public class Makanan {
    private String namaMakanan;
    private double hargaMakanan;
    private int stok;

    public Makanan() {
    	setNamaMakanan("");
    	setHargaMakanan(0);
        setStok(0);
    }

	public String getNamaMakanan() {
		return namaMakanan;
	}

	public void setNamaMakanan(String namaMakanan) {
		this.namaMakanan = namaMakanan;
	}

	public double getHargaMakanan() {
		return hargaMakanan;
	}

	public void setHargaMakanan(double hargaMakanan) {
		this.hargaMakanan = hargaMakanan;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
}
