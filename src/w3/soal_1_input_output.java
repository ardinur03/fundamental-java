/**
 * Filename : soal1_input_output.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.util.*;

public class soal_1_input_output {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.print("Masukkan input : ");
		s = scan.nextLine();
		scan.close();
		
		s = s.trim();
		
		if (s.length() == 0) {
			System.out.println("Inputan tidak boleh kosong !");
		} else {
			String[] strings = s.split("['!?,._@ ]+");
			System.out.println(strings.length);
			for (String str : strings) {
				System.out.println(str);
			}
		}
	}

}
