/**
 * Filename : Barang.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w4_kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; // yang diubah	

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public void addStok(int stok) {
		this.stok += stok;
	}
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}


}
