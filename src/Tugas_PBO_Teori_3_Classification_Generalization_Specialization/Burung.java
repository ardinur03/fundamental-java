package Tugas_PBO_Teori_3_Classification_Generalization_Specialization;

public class Burung extends Vertebrates {

    void insertBurung(String nama, String jenisDarah, int jumlahKaki, String ciriKhas) {
        setNama_animals(nama);
        setJenisDarah(jenisDarah);
        setJumlahKaki(jumlahKaki);
        setCiriKhas(ciriKhas);
    }

    void displayBurung() {
        Burung[] burungs;
        burungs = new Burung[20];

        // insert data burung 1
        burungs[0] = new Burung();
        burungs[0].insertBurung("Merpati", "Merah", 2, "Kukuruyuk");

        // insert data burung 2
        burungs[1] = new Burung();
        burungs[1].insertBurung("Bebek", "Hitam", 2, "Kukuruyuk");

        // insert data burung 3
        burungs[2] = new Burung();
        burungs[2].insertBurung("Ayam", "Putih", 2, "Kukuruyuk");

        // print info
        for (Burung burung : burungs) {
            System.out.println("Nama : " + burung.getNama_animals());
            System.out.println("Jenis Darah : " + burung.getJenisDarah());
            System.out.println("Jumlah Kaki : " + burung.getJumlahKaki());
            System.out.println("Ciri Khas : " + burung.getCiriKhas());
        }
    }
}
