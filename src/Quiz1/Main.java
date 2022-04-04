package Quiz1;

public class Main {

    static void bayarPajak(Property kategori) {
        System.out.println("--------------Pajak-------------------");
        if (kategori instanceof RumahPribadi) {
            RumahPribadi s = (RumahPribadi) kategori;
            s.pajakRumah();
        } else if (kategori instanceof Ruko) {
            Ruko r = (Ruko) kategori;
            r.pajakRuko();
        }
        System.out.println("Terima kasih telah membayar pajak");

    }

    public static void main(String[] args) {
        try {
            Property rumah1 = new RumahPribadi("6x10m", "36 meter persegi", 1, 1, "450 juta", 2);
            rumah1.printData();
            bayarPajak(rumah1);

            Property ruko1 = new Ruko("4x10 m", "60 meter persegi", 2, 1, "600 juta", true, true, true, true);
            ruko1.printData();
            bayarPajak(ruko1);
        } catch (NullPointerException e) {
            System.out.println("belum di inisiasi");
        }
    }
}
