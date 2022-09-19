/**
 * @author  :  Muhamad Ardi Nur Insan 
 * @NIM     :  211511022
 * @Kelas   :  2A
 * @MataKuliah :  Pemrograman Berorientasi Objek Teori
 * @NamaFile : RumusCircle.java
 */


package Tugas_PBO_Teori_2_Agregasi;

class Operation {
	int square(int n) {
		return n * n;
	}
}

public class RumusCircle {
	Operation op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);// code reusability (i.e. delegates the method call).
		return pi * rsquare;
	}
}
