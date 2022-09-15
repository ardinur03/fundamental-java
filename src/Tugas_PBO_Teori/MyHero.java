/**
 * Author   : Muhamad Ardi Nur Insan
 * NIM      : 211511022
 * Kelas    : D3 Teknik Informatika
 * Filename ; MyHero.java
 */

package Tugas_PBO_Teori;

public class MyHero {
	public static void main(String[] args) {
		HeroMobileLegend myHero1 = new HeroMobileLegend("Alucard", "Fighter", 333);
		System.out.println("\nHero 1");
		myHero1.getHeroData();
		System.out.println("Status Hero : Sedang Betanding Classic dengan Computer");
		myHero1.runMatchClassic();
		
		System.out.println("\n------------------------------------------------");
		
		HeroMobileLegend myHero2 = new HeroMobileLegend("Moskov", "Marksman", 500);
		System.out.println("\nHero 2");
		myHero2.getHeroData();
		System.out.println("Status : Tidak dalam Match");
	}

}










// class Inventori





