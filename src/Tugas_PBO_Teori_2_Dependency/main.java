/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : main.java
 */

package Tugas_PBO_Teori_2_Dependency;

public class main {

	public static void main(String[] args) {
		TechWebApp fwa1 = new TechWebApp();
		TechWebApp fwa2 = new TechWebApp();
		TechWebApp fwa3 = new TechWebApp();
		
		// proses assignment pada state objec fwa
		fwa1.setNamaBahasaPemrograman("PHP");
		fwa1.namaFramework = "Laravel";
		fwa1.cetaktechWeb(1);
		
		fwa2.setNamaBahasaPemrograman("Java Script");
		fwa2.namaFramework = "Vue JS";
		fwa2.cetaktechWeb(2);
		
		fwa3.setNamaBahasaPemrograman("Ruby");
		fwa3.namaFramework = "Ruby On Rails";
		fwa3.cetaktechWeb(3);

	}

}
