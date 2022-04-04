package StudiKasus31;

public class MiniBus extends Mobil {

    private boolean ac;
    private boolean gorden;

    // Constructor
    public MiniBus(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil, boolean ac, boolean gorden) {
        super(noPlat, merk, warna, bahanBakar, tahunKeluaran, kategoriMobil);
        this.ac = ac;
        this.gorden = gorden;
    }

    // Behavior
    @Override
    public void print() {
        super.print();
        System.out.println("AC\t\t: " + this.getAc());
        System.out.println("Gorden\t\t: " + this.getGorden());
        berjalan();
        berhenti();

    }

    public void berjalan() {
        System.out.println("minibus sedang berjalan");
    }

    public void berhenti() {
        System.out.println("minibus sedang berhenti");
    }

    public void telolet() {
        System.out.println("bus membunyikan klakson");
    }

    // Setter Getter
    public boolean getAc() {
        return this.ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean getGorden() {
        return this.gorden;
    }

    public void setGorden(boolean gorden) {
        this.gorden = gorden;
    }

}
