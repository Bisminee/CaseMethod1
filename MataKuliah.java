
class MataKuliah {

    String kodeMK, namaMK;
    int sks;

    MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.print("Kode MK: " + kodeMK + " | " 
                        + "Nama: " + namaMK + " | " 
                        + "SKS: " + sks);
        System.out.println();
    }
}
