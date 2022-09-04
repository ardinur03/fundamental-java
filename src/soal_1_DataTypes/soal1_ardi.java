/**
 * Filename : soal1_ardi.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */
package soal_1_DataTypes;

import java.util.*;

public class soal1_ardi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isStop = true;

		do {
			try {
				System.out.print("Enter number : ");
				long inputNumber = input.nextLong();
				System.out.println(inputNumber + " can be fitted in");
				if (inputNumber >= Short.MIN_VALUE && inputNumber <= Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if (inputNumber >= Integer.MIN_VALUE && inputNumber <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				if (inputNumber >= Long.MIN_VALUE && inputNumber <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println("can’t be fitted anywhere");
			}
			System.out.print("\n\nDo you want quit ? (q/Q) : " );
			char getChar = input.next().charAt(0);
			isStop = getChar == 'q' || getChar == 'Q'? true : false;
		} while (isStop != true);
		
	}
}
