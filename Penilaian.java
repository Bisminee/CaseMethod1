
class Penilaian {

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    Penilaian(Mahasiswa mhs, MataKuliah matkul, double tugas, double UTS, double UAS) {
        mahasiswa = mhs;
        mataKuliah = matkul;
        nilaiTugas = tugas;
        nilaiUTS = UTS;
        nilaiUAS = UAS;

    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}
