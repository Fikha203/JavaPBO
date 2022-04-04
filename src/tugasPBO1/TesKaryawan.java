package tugasPBO1;

import java.util.Scanner;

public class TesKaryawan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Karyawan karyawan1 = new Karyawan();
        for (int i = 0; i < 3; i++) {
            System.out.println("==============================");
            System.out.println("Input Data");
            System.out.println("==============================");
            System.out.print("Masukkan Nama : ");
            karyawan1.nama = input.nextLine();
            System.out.print("Masukkan Umur : ");
            karyawan1.umur = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Alamat : ");
            karyawan1.alamat = input.nextLine();
            System.out.print("Masukkan no Telpon : ");
            karyawan1.noTelp = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            karyawan1.jenisKel = input.nextLine();
            System.out.print("Masukkan Kategori : ");
            karyawan1.kategori = input.nextLine();
            
            karyawan1.printData();
            karyawan1.kerja();

        }

    }
}
