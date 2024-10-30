public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa(23533742, "Rizky", "Informatika", 'A', 3.9);

        Mahasiswa mhs2 = new Mahasiswa(23533741, "Alex", "Informatika", 'B', 3.7);

        Mahasiswa mhs3 = new Mahasiswa(23533740, "Justin", "Informatika", 'C', 3.5);

        
        mhs1.tampilData();
        mhs1.alamat("Madiun");
        System.out.println("IPK   : " + mhs1.getIpk());
        System.out.println("Kelulusan: " + mhs1.lulus(2021));

        mhs2.tampilData();
        mhs2.alamat("Ponorogo");
        System.out.println("IPK   : " + mhs2.getIpk());
        System.out.println("Kelulusan : " + mhs2.lulus(2022));

        
        mhs3.tampilData();
        mhs3.alamat("Magetan");
        System.out.println("IPK   : " + mhs3.getIpk());
        System.out.println("Kelulusan : " + mhs3.lulus(2023));
    }
}
