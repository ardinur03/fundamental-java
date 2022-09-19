/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : techWebApp.java
 */

package Tugas_PBO_Teori_2_Dependency;

public class TechWebApp {
	private String namaBahasaPemrograman;
	public String namaFramework;
	
	void cetaktechWeb(int urutan) {
		System.out.println("No " + urutan);
		System.out.println("Nama Bahasa Pemrograman : " + getNamaBahasaPemrograman());
		System.out.println("Nama Framework          : " + namaFramework);
		System.out.println();
	}

	public String getNamaBahasaPemrograman() {
		return namaBahasaPemrograman;
	}

	public void setNamaBahasaPemrograman(String namaBahasaPemrograman) {
		this.namaBahasaPemrograman = namaBahasaPemrograman;
	}
}
