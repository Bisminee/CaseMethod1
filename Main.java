
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pilihan = true;
        Fungsi fgs = new Fungsi();
        Mahasiswa mhs[] = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Informatika")
        };

        MataKuliah matkul[] = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)

        };

        Penilaian nilai[] = {
            new Penilaian(mhs[0], matkul[0], 80, 85, 90),
            new Penilaian(mhs[0], matkul[1], 60, 75, 70),
            new Penilaian(mhs[1], matkul[0], 75, 70, 80),
            new Penilaian(mhs[2], matkul[1], 85, 90, 95),
            new Penilaian(mhs[2], matkul[2], 80, 90, 65)
        };

        while (pilihan) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("Data Mahasiswa:");
                    for (Mahasiswa dataMhs : mhs) {
                        dataMhs.tampilMahasiswa();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Data Mata Kuliah:");
                    for (MataKuliah dataMatkul : matkul) {
                        dataMatkul.tampilMataKuliah();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Data Penilaian: ");
                    fgs.tampilPenilaian(nilai);
                    break;
                case 4:
                    System.out.println("Urutan Data Penilaian(DSC): ");
                    fgs.SortDSC(nilai);
                    fgs.tampilPenilaian(nilai);
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = sc.nextLine();
                    fgs.cariMahasiswaNIM(cari, mhs);
                    System.out.println();
                    break;
                case 0 :
                    System.out.println("Terima kasih!");
                    pilihan = false;
                    break;
                default:
                    System.out.println("Tidak valid. Silahkan pilih menu yang tersedia");
                    break;
            }

        }
    }
}
