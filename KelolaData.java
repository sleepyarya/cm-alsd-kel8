public class KelolaData {
    void UrutkanPenilaian(Penilaian[] penilaianList) {
        for (int i = 0; i < penilaianList.length - 1; i++) {
            for (int j = 0; j < penilaianList.length - i - 1; j++) {
                if (penilaianList[j].nilaiAkhir < penilaianList[j + 1].nilaiAkhir) {
                    Penilaian temp = penilaianList[j];
                    penilaianList[j] = penilaianList[j + 1];
                    penilaianList[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan nilai akhir.");
    }

    void cariMahasiswa(String NIM, Mahasiswa[] mahasiswaList) {
        boolean ditemukan = false;
        for (int i = 0; i < mahasiswaList.length; i++) {
            if (mahasiswaList[i].NIM.equals(NIM)) {
                System.out.printf("| %-15s | %-20s | %-18s |\n", "NIM", "Nama", "Prodi");
                System.out.println("---------------------------------------------------------------");
                System.out.printf("| %-15s | %-20s | %-12s |\n", mahasiswaList[i].NIM, mahasiswaList[i].nama, mahasiswaList[i].prodi); 
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + NIM + " tidak ditemukan.");
        }
    }
}