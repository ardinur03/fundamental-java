/**
 * Filename : soal5_ardi.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */
package soal_5_String;

import java.util.Scanner;

public class soal5_ardi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String inputStringA, inputStringB;
		int jumlahChar;
		
		System.out.print("masukkan String 1 : ");
		inputStringA = input.nextLine();
		System.out.print("masukkan String 2 : ");
		inputStringB = input.nextLine();
		
		jumlahChar = inputStringA.length() + inputStringB.length();
		System.out.println("\nOutput : ");
		System.out.println(jumlahChar);
		System.out.println(CompareAB(inputStringA, inputStringB));
		System.out.println(UpperFirstStr(inputStringA, inputStringB));
	}
	
	public static String CompareAB(String stringParamA, String stringParamB) {
		return stringParamA.compareTo(stringParamB) > 0 ? "Yes" : "N0";
	}
	
	public static String UpperFirstStr(String stringParamA, String stringParamB) {
		String kata1, kata2;
		kata1 = stringParamA.substring(0, 1).toUpperCase() + stringParamA.substring(1).toLowerCase();
		kata2 = stringParamB.substring(0, 1).toUpperCase() + stringParamB.substring(1).toLowerCase();
		return kata1 + " " + kata2;
	}
}
