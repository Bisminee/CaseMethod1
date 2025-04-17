import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pilihan = true;
        Mahasiswa[] dataMhs = new Mahasiswa[3];
        MataKuliah[] dataMatkul = new MataKuliah[3];
        Penilaian[] dataPenilaian = new Penilaian[5];        

        //data Mahasiswa
        dataMhs[0] = new Mahasiswa("Ali Rahman", "22001", "Informatika");
        dataMhs[1] = new Mahasiswa("Budi Santoso", "22002", "Informatika"); 
        dataMhs[2] = new Mahasiswa("Citra Dewi", "22003", "Sistem Informasi Bisnis");

        //dataMataKuliah
        dataMatkul[0] = new MataKuliah("MK001", "Struktur Data", 3);
        dataMatkul[1] = new MataKuliah("MK002", "Basis Data", 3);
        dataMatkul[2] = new MataKuliah("MK003", "Desain Web", 3);

        //dataPenilaian[0] = new Penilaian("Ali Rahman", "22001", "MK001", "Struktur Data", 80, 85, 90);
        //dataPenilaian[1] = new Penilaian("Ali Rahman", "22001", "MK002", "Basis Data", 60, 75, 70);
        //dataPenilaian[2] = new Penilaian("Budi Santoso", "22002", "MK001", "Struktur Data", 75, 70, 80);
        //dataPenilaian[3] = new Penilaian("Citra Dewi", "22003", "MK002", "Basis Data", 85, 90, 95);
        //dataPenilaian[4] = new Penilaian("Citra Dewi", "22003", "MK003", "Desain Web", 80, 90, 65);

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
            System.out.println();


            switch (pilih) {
                case 1:
                    System.out.println("Data Mahasiswa:");
                    for (Mahasiswa mhs : dataMhs) {
                        mhs.tampilMahasiswa();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Data Mata Kuliah:");
                    for (MataKuliah matkul : dataMatkul) {
                        matkul.tampilMataKuliah();
                    }
                    System.out.println();
                case 3:
                    System.out.println("Data Penilaian:");
                    //for (Penilaian nilai : dataPenilaian) {
                        //nial.Penilaian;
                    //}
                    break;
                default:
                    break;
            }
        
        }
    }
}

