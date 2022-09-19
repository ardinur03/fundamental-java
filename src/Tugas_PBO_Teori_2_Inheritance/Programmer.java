/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : Programmer.java
 */

package Tugas_PBO_Teori_2_Inheritance;

public class Programmer extends Employee {
	String kategoriJabatan;
	final float gajiPokok = 3500000;
	float bonus;
	
	@Override
	void cetakDataEmployee(int urutan) {
		System.out.println("No " + urutan);
		System.out.println("Nama       : " + name);
		System.out.println("Umur       : " + age);
		System.out.println("Alamat     : " + address);
		System.out.println("Jabatan    : " + position);
		System.out.println("Kategori   : " + kategoriJabatan);
		System.out.println("Gaji Pokok : " + (int)gajiPokok);
		System.out.println("Bonus      : " + (int)bonus);
		System.out.println("Total Gaji : " + (int)(gajiPokok + bonus));
		System.out.println();
	}
}
