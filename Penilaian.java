public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah,
            double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.mataKuliah = mataKuliah;
        hitungNilaiAkhir();
    }

    public Penilaian() {

    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    void tampilNilai(Penilaian[] nilai) {
        System.out.printf("| %-30s | %-35s | %-12s |\n", "Nama", "Mata Kuliah", "Nilai Akhir");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("| %-30s | %-35s | %-12s |\n", nilai[i].mahasiswa.nama, nilai[i].mataKuliah.namaMK,
                    nilai[i].nilaiAkhir);
        }
    }
}