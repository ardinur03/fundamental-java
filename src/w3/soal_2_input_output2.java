/**
 * Filename : soal2_input_output2.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

import java.util.Scanner;

public class soal_2_input_output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf( "%-15s%03d %n", s1, x);
        }
        System.out.println("================================");
	}

}
