/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : main.java
 */

package Tugas_PBO_Teori_2_Inheritance;

public class Main {
	public static void main(String[] args) {
		InfrastrukturDatabase idb = new InfrastrukturDatabase();
		idb.name = "Muhamad Ardi Nur Insan";
		idb.age = 19;
		idb.address = "Jalan Raya Contong";
		idb.position = "Devops Engineer";
		idb.tunjangan = 1000000;
		idb.bonus = 2000000;
		idb.cetakDataEmployee(1);

		Programmer dev1 = new Programmer();
		dev1.name = "Bujank Hafidh";
		dev1.age = 19;
		dev1.address = "Jalan Caringin";
		dev1.position = "Front End Developer";
		dev1.kategoriJabatan = "Junior Developer";
		dev1.bonus = 7000000;
		dev1.cetakDataEmployee(2);
		
		Programmer dev2 = new Programmer();
		dev2.name = "Bujank Diaz";
		dev2.age = 19;
		dev2.address = "Jalan Gunbat";
		dev2.position = "Front End Developer";
		dev2.kategoriJabatan = "Junior Developer";
		dev2.bonus = 7000000;
		dev2.cetakDataEmployee(3);
	}
}
