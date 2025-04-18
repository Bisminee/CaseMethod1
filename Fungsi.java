public class Fungsi {
    Penilaian nilai[] = new Penilaian[5];
    int idx;

    void hitungNilaiAkhir(Penilaian nilai) {
        nilai.nilaiAkhir = (0.3 * nilai.nilaiTugas) + (0.3 * nilai.nilaiUTS) + (0.4 * nilai.nilaiUAS);
        System.out.println("Nilai Akhir: " + nilai.nilaiAkhir);
    }

    int cariMahasiswaNIM(int cari) {
        return -1;
    }

    void tampilPenilaian(Penilaian nilai[]) {
        System.out.println("Data Penilaian: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i].mahasiswa.nama + " | " + nilai[i].mataKuliah.namaMK + " | ");
            hitungNilaiAkhir(nilai[i]);
        }
    }
}
