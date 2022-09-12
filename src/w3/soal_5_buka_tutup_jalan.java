/**
 * Filename : soal5_buka_tutup_jalan.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.util.Scanner;

public class soal_5_buka_tutup_jalan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mobil = scan.nextLine();
		scan.close();
		mobil = mobil.trim();
		String[] banyakMobil = mobil.split(" ");
		String mobil1 = banyakMobil[0];
		String mobil2 = banyakMobil[1];
		String mobil3 = banyakMobil[2];
		String mobil4 = banyakMobil[3];
		
		String totalMobil = mobil1 + mobil2 + mobil3 + mobil4;
		//debug
//		System.out.println(totalMobil);
		long totalMobil2 = Long.parseLong(totalMobil) - 999999 -1;
		if((totalMobil2 % 5) == 0) {
			System.out.println("Berhenti");
		} else {
			System.out.println("Jalan");
		}

	}

}
