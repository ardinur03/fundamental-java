/**
 * Author   : Muhamad Ardi Nur Insan
 * NIM      : 211511022
 * Kelas    : D3 Teknik Informatika
 * Filename ; HeroMobileLegend.java
 */

package Tugas_PBO_Teori_1;

import java.util.Random;

public class HeroMobileLegend {
	
	private String nameHero;
	private String roleHero;
	private int heroPower = 0;
	
	Random randomObject = new Random();
	
	// constructor class
	public HeroMobileLegend(String nameHero, String roleHero, int heroPower) {
		this.setNameHero(nameHero);
		this.setRoleHero(roleHero);
		this.setHeroPower(heroPower);
	}

	public void setNameHero(String nameHero) {
		this.nameHero = nameHero;
	}

	public void setRoleHero(String roleHero) {
		this.roleHero = roleHero;
	}

	// mencoba menggunakan encapsulasi protected pada method 
	protected int setHeroPower(int heroPower) {
		return this.heroPower = heroPower;
	}
    
	// hero main programnya
	public void getHeroData() {
		System.out.println("Nama Hero  : " + nameHero);
		System.out.println("Role Hero  : " + roleHero);
		System.out.println("Hero Power : " + heroPower);
	}
	
	private String setMatchClassic(String namaHero, String roleHero, int heroPower) {
		// random integer dan lalu di casting ke format integer
		int heroComputerRandom =  randomObject.nextInt(1000);
		String kata;
		
		if(heroPower >= heroComputerRandom) {
			kata = "Yeayy kamu Memenangkan pertandingan !";
		}else if(heroPower <= heroComputerRandom) {
			kata = "Yahhh kamu kalah !";
		} else {
			kata = "tidak diketahui";
		}
		
		return kata;
	}
	
	public void runMatchClassic() {
		String kataTemp;
		kataTemp = this.setMatchClassic(this.nameHero, this.roleHero, this.heroPower);
		System.out.print("Status hasil pertandingan : ");
		System.out.println(kataTemp);
	}
	
}
