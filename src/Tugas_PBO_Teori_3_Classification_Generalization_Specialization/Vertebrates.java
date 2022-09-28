package Tugas_PBO_Teori_3_Classification_Generalization_Specialization;

abstract class Vertebrates extends Animals {
    private String jenisDarah;
    private int jumlahKaki;
    private String ciriKhas;
    
	public String getJenisDarah() {
		return jenisDarah;
	}
	public void setJenisDarah(String jenisDarah) {
		this.jenisDarah = jenisDarah;
	}
	public int getJumlahKaki() {
		return jumlahKaki;
	}
	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}
	public String getCiriKhas() {
		return ciriKhas;
	}
	public void setCiriKhas(String ciriKhas) {
		this.ciriKhas = ciriKhas;
	}
}
