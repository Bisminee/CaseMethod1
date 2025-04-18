class Mahasiswa{
    String NIM, nama, prodi;
    
    Mahasiswa(String NIM, String nama,String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
            System.out.print("NIM: " + NIM + " | " 
            + "Nama: " + nama + " | " 
            + "Prodi: " + prodi);
            System.out.println();
    }
}