package StudiKasus31;

public class Tes {

    // Polymorphic Arguments
    static void opsi(Mobil kategori) {
        if (kategori instanceof MobilPribadi) {
            MobilPribadi s = (MobilPribadi) kategori;
            s.print();
        } else if (kategori instanceof MiniBus) {
            MiniBus r = (MiniBus) kategori;
            r.print();
        } else if (kategori instanceof Bus) {
            Bus a = (Bus) kategori;
            a.print();
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("FILKOM Tour and Travel");
        System.out.println("=================================");

        Mobil mobil = new Mobil("B 1234 AB", "Toyota", "Hitam", "Pertalite", 2013, "Mobil");
        mobil.print();
        mobil.maju();
        mobil.mundur();
        mobil.mundur();
        System.out.println("=================================");
        
        Mobil mobilPribadi = new MobilPribadi("C 7682 EXA", "Nissan", "Merah", "Pertamax", 2015, "Mobil Pribadi", 29876230, "LCD");
        opsi(mobilPribadi);
        System.out.println("=================================");

        Mobil bus = new Bus("M 2627 AGH", "Suzuki", "Putih", "Solar", 2014, "Bus", 40, true);
        opsi(bus);
        System.out.println("=================================");

        Mobil miniBus = new MiniBus("L 6382 KDW", "Honda", "Biru", "pertalite", 2012, "mini bus", true, true);
        opsi(miniBus);
        
        
        System.out.println("=================================");
        System.out.println("Data telah disimpan");
        System.out.println("Terima kasih");

    }
}
