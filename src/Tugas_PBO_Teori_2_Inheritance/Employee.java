/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : Employees.java
 */

package Tugas_PBO_Teori_2_Inheritance;

public class Employee {
	public String name;
	public int age;
	public String address;
	public String position;
	
	void cetakDataEmployee(int urutan) {
		System.out.println("No " + urutan);
		System.out.println("Nama    : " + name);
		System.out.println("Umur    : " + age);
		System.out.println("Alamat  : " + address);
		System.out.println("Jabatan : " + position);
		System.out.println();
	}
}
