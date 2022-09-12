/**
 * Filename : soal6_big_number.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.math.BigInteger;
import java.util.Scanner;

public class soal_6_big_number {

	public static void main(String[] args) {
		 BigInteger A, B;
		 Scanner input = new Scanner(System.in);
		 
		 A = input.nextBigInteger();
		 B = input.nextBigInteger();
		
		 System.out.println(A.add(B));
		 System.out.println(A.multiply(B));
	}

}
