package tugasPBO1;

import java.util.Scanner;

public class tesMobil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mobil mobil1 = new Mobil();
        for (int i = 0; i < 3; i++) {
            System.out.println("==============================");
            System.out.println("Input Data");
            System.out.println("==============================");
            System.out.print("Masukkan Merk : ");
            mobil1.merk = input.nextLine();
            System.out.print("Masukkan tahun keluaran : ");
            mobil1.thnKeluar = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan warna : ");
            mobil1.warna = input.nextLine();
            System.out.print("Masukkan no Plat : ");
            mobil1.noPlat = input.nextLine();
            
            mobil1.printData();
            mobil1.startEngine();
            mobil1.gas();
            mobil1.rem();

        }
    }

}
