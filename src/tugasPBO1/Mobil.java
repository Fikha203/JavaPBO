package tugasPBO1;

public class Mobil {

    String merk;
    int thnKeluar;
    String warna;
    String noPlat;

    void printData() {
        System.out.println("==============================");
        System.out.println("Data Mobil");
        System.out.println("==============================");
        System.out.println("Merk : " + merk);
        System.out.println("Tahun Keluaran : " + thnKeluar);
        System.out.println("Warna : " + warna);
        System.out.println("Plat Nomot : " + noPlat);
    }

    void startEngine() {
        System.out.println("Menghidupkan mesin");
    }
    void gas(){
        System.out.println("Mobil maju");
    }
    void rem(){
        System.out.println("Mobil berhenti");
    }
}
