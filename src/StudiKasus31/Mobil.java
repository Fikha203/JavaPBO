package StudiKasus31;

public class Mobil {

    private String noPlat;
    private String merk;
    private String warna;
    private String bahanBakar;
    private int tahunKeluaran;
    private String kategoriMobil;

    // Constructor
    public Mobil(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
        this.tahunKeluaran = tahunKeluaran;
        this.kategoriMobil = kategoriMobil;

    }

    // Behavior
    public void print() {
        System.out.println("Nomor plat\t: " + this.getNoPlat());
        System.out.println("Merk\t\t: " + this.getMerk());
        System.out.println("Warna\t\t: " + this.getWarna());
        System.out.println("Bahan bakar\t: " + this.getBahanBakar());
        System.out.println("Tahun keluaran\t: " + this.getTahunKeluaran());
        System.out.println("Kategori mobil\t: " + this.getKategoriMobil());
    }

    public void maju() {
        System.out.println("Mobil bisa bergerak maju");
    }

    public void mundur() {
        System.out.println("Mobil bisa bergerak mundur");
    }

    public void berbelok() {
        System.out.println("Mobil bisa berbelok");
    }

    // Setter Getter
    public void setKategoriMobil(String kategoriMobil) {
        this.kategoriMobil = kategoriMobil;
    }

    public String getKategoriMobil() {
        return this.kategoriMobil;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return this.bahanBakar;
    }

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public int getTahunKeluaran() {
        return this.tahunKeluaran;
    }

}
