
public class Fungsi {


    void cariMahasiswaNIM(String cari, Mahasiswa mhs[]) {
        int posisi = -1;
        for (int i = 0; i < mhs.length; i++) {
            if(cari.equals(mhs[i].NIM)){
                posisi = i;
                System.out.println("Mahasiswa Ditemukan: NIM: " + mhs[i].NIM + " | " 
                                    + mhs[i].nama + " | " + mhs[i].prodi);
            }else if(posisi == -1){
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    void tampilPenilaian(Penilaian nilai[]) {
        for (Penilaian dataPenilaian : nilai) {
            dataPenilaian.hitungNilaiAkhir();
            System.out.println(dataPenilaian.mahasiswa.nama 
                                + " | " + dataPenilaian.mataKuliah.namaMK 
                                + " | " + "Nilai akhir: " + dataPenilaian.nilaiAkhir);
}
        System.out.println();
    }

    void SortDSC(Penilaian nilai[]) {
        for (Penilaian dataPenilaian : nilai) {
            dataPenilaian.hitungNilaiAkhir();
        }
        for (int i = 0; i < nilai.length; i++) {
            int max = i;
            for (int j = i+1; j < nilai.length; j++) {
                if (nilai[j].nilaiAkhir > nilai[max].nilaiAkhir ) {
                    max = j;
                }
            }
            Penilaian temp = nilai[i];
            nilai[i] = nilai[max];
            nilai[max] = temp;
        }
    }
}
