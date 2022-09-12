/**
 * Filename : soal3_Berhitung.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.util.Scanner;

public class soal_3_berhitung {
	public static void main(String[] args) {
		int A, B;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		s  = s.trim();
		
		try {
			if(s.length() == 0) {
				System.out.println(0);
			} else {
				String[] strings = s.split(" ");
				A = Integer.parseInt(strings[0]);
				B = Integer.parseInt(strings[2]);
				if(A >= 1 && B <= 1000) {
					if(strings[1].equals("+")) {
						System.out.println(A+B);
					} else if (strings[1].equals("-")) {
						System.out.println(A-B);
					} else if (strings[1].equals("*")) {
						System.out.println(A*B);
					} else if (strings[1].equals("/")) {
						if ((A%B) == 0) {
							System.out.println(A/B);
							
						} else {
							System.out.println("Operasi gagal, bilangan tidak habis dibagi 0");
						}
						
					} else if (strings[1].equals("%")) {
						System.out.println(A%B);
					} else {
						System.out.println("Operator tidak valid");
					}
				} else {
					System.out.println("Operasi Gagal");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
