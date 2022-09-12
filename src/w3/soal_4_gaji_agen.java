/**
 * Filename : soal4_gaji_agen.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.util.Scanner;

public class soal_4_gaji_agen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double gaji = 500000;
		double gajiPokok = 500000;

		double bonusPenjualan;
		
		int jumlahItem= input.nextInt();
		double jumlahBonus = 0;
		
		if(jumlahItem >= 80) {
			jumlahBonus = 0.35 * (jumlahItem*50000);
			gajiPokok = gajiPokok + jumlahBonus;
		}else if(jumlahBonus >= 40) {
			jumlahBonus = 0.25 * (jumlahItem*50000);
			gajiPokok = gajiPokok + jumlahBonus;
		}else if(jumlahBonus < 15) {
			jumlahBonus = 0.15 * ((15-jumlahItem)*50000);
			gajiPokok = gajiPokok - jumlahBonus;
		}else {
			gajiPokok = 0.10 * (jumlahItem*50000);
		}
		
		System.out.println((int)gajiPokok);
	}

}
