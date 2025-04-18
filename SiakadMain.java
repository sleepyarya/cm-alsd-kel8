import java.util.Scanner;

public class SiakadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Arya Ramadhan", "Teknik Informatika"),
                new Mahasiswa("22002", "Muhammad Hanif", "Teknik Informatika"),
                new Mahasiswa("22003", "Louis Judia B Sinaga", "Teknik Informatika")
        };

        MataKuliah[] matkul = {
                new MataKuliah("MK001", "Struktur Data", 3),
                new MataKuliah("MK002", "Basis Data", 3),
                new MataKuliah("MK003", "Desain Web", 3)
        };

        Penilaian[] nilai = {
                new Penilaian(mhs[0], matkul[0], 85, 90, 80),
                new Penilaian(mhs[0], matkul[1], 82, 90, 85),
                new Penilaian(mhs[1], matkul[1], 90, 87, 85),
                new Penilaian(mhs[1], matkul[2], 85, 90, 90),
                new Penilaian(mhs[2], matkul[0], 95, 80, 85),
                new Penilaian(mhs[2], matkul[2], 85, 90, 95),
        };

        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Daftar Mahasiswa ===");
                    Mahasiswa mahasiswa = new Mahasiswa("", "", "");
                    mahasiswa.tampilMahasiswa(mhs);
                    break;

                case 2:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
                    MataKuliah mataKuliah = new MataKuliah("", "", 0);
                    mataKuliah.tampilMataKuliah(matkul);
                    break;

                case 3:
                    System.out.println("\n=== Data Penilaian ===");
                    Penilaian penilaian = new Penilaian();
                    penilaian.tampilNilai(nilai);
                    break;

                case 4:
                    System.out.println("\n=== Data Setelah Diurutkan ===");
                    KelolaData urutkanpenilaianData = new KelolaData();
                    urutkanpenilaianData.UrutkanPenilaian(nilai);
                    Penilaian penilaian1 = new Penilaian();
                    penilaian1.tampilNilai(nilai);
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM yang ingin dicari : ");
                    String nim = sc.nextLine(); 
                    KelolaData cariData = new KelolaData();
                    cariData.cariMahasiswa(nim, mhs);
                    break;             
            }
        } while (pilihan != 0);

        sc.close();
    }
}
