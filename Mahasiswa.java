public class Mahasiswa {
    String NIM, nama, prodi;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(Mahasiswa[] mhs) {
        System.out.printf("| %-15s | %-20s | %-12s |\n", "NIM", "Nama", "Prodi");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < mhs.length; i++) {
            System.out.printf("| %-15s | %-20s | %-12s |\n", mhs[i].NIM, mhs[i].nama, mhs[i].prodi);
        }
    }
}
