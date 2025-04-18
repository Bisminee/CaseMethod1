
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
        System.out.println("Data Penilaian: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i].mahasiswa.nama + " | " + nilai[i].mataKuliah.namaMK + " | ");
            nilai[i].hitungNilaiAkhir();
        }
        System.out.println();
    }
}
