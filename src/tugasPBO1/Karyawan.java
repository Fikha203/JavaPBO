package tugasPBO1;

public class Karyawan {

    String nama;
    int umur;
    String alamat;
    String noTelp;
    String jenisKel;
    String kategori;

    void printData(){
         System.out.println("==============================");
            System.out.println("Data Karyawan");
            System.out.println("==============================");
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
            System.out.println("Alamat : " + alamat);
            System.out.println("No Telpon : " + noTelp);
            System.out.println("Jenis Kelamin : " + jenisKel);
            System.out.println("Kategori : " + kategori);
    }
    void kerja(){
        System.out.println("Karyawan sedang bekerja");
    }

}
