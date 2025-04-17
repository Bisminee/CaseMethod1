class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas + nilaiUTS + nilaiUAS)/3;
        System.out.println("Nilai akhir: " + nilaiAkhir);
    }

    Penilaian(Mahasiswa mahasiswa, MataKuliah matKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.matKuliah = matKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        
    }
}
