/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : InfrastrukturDatabase.java
 */

package Tugas_PBO_Teori_2_Inheritance;

public class InfrastrukturDatabase extends Employee {
	final float gajiPokok = 5000000;
	float tunjangan;
	float bonus;

	@Override
	void cetakDataEmployee(int urutan) {
		System.out.println("No " + urutan);
		System.out.println("Nama       : " + name);
		System.out.println("Umur       : " + age);
		System.out.println("Alamat     : " + address);
		System.out.println("Jabatan    : " + position);
		System.out.println("Gaji Pokok : " + (int)gajiPokok);
		System.out.println("Tunjangan  : " + (int)tunjangan);
		System.out.println("Bonus      : " + (int)bonus);
		System.out.println("Total Gaji : " + (int)(gajiPokok + tunjangan + bonus));
		System.out.println();
	}
}
