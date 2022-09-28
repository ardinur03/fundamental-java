package Tugas_PBO_Teori_3_Classification_Generalization_Specialization;

public class Mamalia extends Vertebrates {

    void insertMamalia(String nama, String jenisDarah, int jumlahKaki, String ciriKhas) {
        setNama_animals(nama);
        setJenisDarah(jenisDarah);
        setJumlahKaki(jumlahKaki);
        setCiriKhas(ciriKhas);
    }

    void displayMamalia() {
        Mamalia[] mamals;
        mamals = new Mamalia[20];

        // insert data mamalia 1
        mamals[0] = new Mamalia();
        mamals[0].insertMamalia("Kucing", "Panas", 4, "Meong Meong..");

        // insert data mamalia 2
        mamals[1] = new Mamalia();
        mamals[1].insertMamalia("Anjing", "Merah", 4, "Guk Guk");

        // insert data mamalia 3
        mamals[2] = new Mamalia();
        mamals[2].insertMamalia("Kuda", "Hitam", 4, "Kukuruyuk");

        // print info
        for (Mamalia mamalia : mamals) {
            System.out.println("Nama : " + mamalia.getNama_animals());
            System.out.println("Jenis Darah : " + mamalia.getJenisDarah());
            System.out.println("Jumlah Kaki : " + mamalia.getJumlahKaki());
            System.out.println("Ciri Khas : " + mamalia.getCiriKhas());
            System.out.println("===================================");
        }
    }
}
