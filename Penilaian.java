
class Penilaian {

    Mahasiswa mahasiswa[] = new Mahasiswa[5];
    MataKuliah mataKuliah[] = new MataKuliah[mahasiswa.length];
    double nilaiTugas[], nilaiUTS[], nilaiUAS[], nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa[], MataKuliah mataKuliah[], double tugas, double UTS, double UAS) {
        System.out.println("\nData Penilaian:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i].nama + " | " + mataKuliah[i] + " | ");
            hitungNilaiAkhir(i);
            System.out.println();
        }

    }

    void hitungNilaiAkhir(int i) {
        nilaiAkhir = (0.3 * nilaiTugas[i]) + (0.3 * nilaiUTS[i]) + (0.4 * nilaiUAS[i]);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }

    int cariMahasiswaNIM(int cari){
        return -1;
    }
}
