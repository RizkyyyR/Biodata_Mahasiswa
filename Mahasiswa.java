public class Mahasiswa {
    int nim;
    String nama,prodi;
    char kelas;
    double ipk;
    
    public Mahasiswa(int nim, String nama, String prodi, char kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilData() {
        System.out.println("\nNama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Prodi : " + prodi);
    }

    public void alamat(String alamat) {
        System.out.println("Alamat: " + alamat);
    }
    public double getIpk() {
        return ipk;
    }
    public int lulus(int masuk) {
        return masuk + 4;
    }
}
