public class MataKuliah {
    String kodeMK, namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(MataKuliah[] matkul){
        System.out.printf("| %-10s | %-20s | %-8s |\n", "Kode MK", "Nama", "SKS");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("| %-10s | %-20s | %-8s |\n", matkul[i].kodeMK, matkul[i].namaMK, matkul[i].sks);
        }
    }
}