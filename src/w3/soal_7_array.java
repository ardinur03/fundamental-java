/**
 * Filename : soal7_array.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package w3;

public class soal_7_array {
	public static void main(String[] args) {
		// One Dimensional Arrays
		int[] fisrtArray = { 2, 5, 3 };
		int[] secondArray = { 9, 5, 3 };
		int[] thirdArray = { 2, 4, 9 };
		int[] fourthArray = { 10, 11, 12 };
		int[] fifthArray = { 13, 14, 15 };
		int[] sixthArray = { 16, 17, 18 };
		int[] seventhArray = { 19, 20, 21 };
		int[] eighthArray = { 22, 23, 24 };
		int[] ninthArray = { 25, 26, 27 };
		// Two Dimensional Arrays
		int[][] twoDimensionalArray1 = { fisrtArray, secondArray, thirdArray };
		int[][] twoDimensionalArray2 = { fourthArray, fifthArray, sixthArray };
		int[][] twoDimensionalArray3 = { seventhArray, eighthArray, ninthArray };
		// Three Dimensional Array
		int[][][] threeDimensionalArray = { twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3 };
		// Nested loop for display
		for (int z = 0; z < 3; z += 1) {
			System.out.print("{");
			for (int y = 0; y < 3; y += 1) {
				System.out.print("{");
				for (int x = 0; x < 3; x += 1) {
					System.out.print(threeDimensionalArray[z][y][x] + " ");// 3d array: the x is for column, y is for
				}
				System.out.print("} ");
			}
			System.out.print("}");
			System.out.println();
		}

	}

}
