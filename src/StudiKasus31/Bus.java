package StudiKasus31;

public class Bus extends Mobil {

    private int jumlahKursi;
    private boolean tv;

    // Constructor
    public Bus(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil, int jumlahKursi, boolean tv) {
        super(noPlat, merk, warna, bahanBakar, tahunKeluaran, kategoriMobil);
        this.jumlahKursi = jumlahKursi;
        this.tv = tv;
    }

    // Behavior
    public void print() {
        super.print();
        System.out.println("Jumlah kursi\t: " + this.getJumlahKursi());
        System.out.println("Tv\t\t: " + this.getTv());
        dropOff();
        pickUp();
        telolet();

    }

    public void dropOff() {
        System.out.println("bus menurunkan penumpang");
    }

    public void pickUp() {
        System.out.println("bus mengangkut penumpang");
    }

    public void telolet() {
        System.out.println("bus membunyikan klakson");
    }

    // Setter Getter
    public int getJumlahKursi() {
        return this.jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public boolean getTv() {
        return this.tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

}
