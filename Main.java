public class Main {
    public static void main(String[] args) {
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
            new Penilaian(mhs[2], matkul[2], 80, 90, 65),
        };

        fgs.tampilPenilaian(nilai);
        
    }
}
