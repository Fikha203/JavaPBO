package StudiKasus31;

public class MobilPribadi extends Mobil {

    private int noSTNK;
    private String headUnit;

    // Constructor
    public MobilPribadi(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran,String kategoriMobil, int noSTNK, String headUnit) {
        super(noPlat, merk, warna, bahanBakar, tahunKeluaran,kategoriMobil);
        this.noSTNK = noSTNK;
        this.headUnit = headUnit;
    }

    // Behavior
    public void print() {
        super.print();
        System.out.println("Nomor STNK\t: " + this.getNoSTNK());
        System.out.println("Head unit\t: " + this.getHeadUnit());
        bensinFull();
        bensinHabis();
    }

    public void bensinFull() {
        System.out.println("bensin mobil sudah terisi");
    }

    public void bensinHabis() {
        System.out.println("bensin mobil sudah habis");
    }

    // Setter Getter
    public int getNoSTNK() {
        return this.noSTNK;
    }

    public void setNoSTNK(int noSTNK) {
        this.noSTNK = noSTNK;
    }

    public String getHeadUnit() {
        return this.headUnit;
    }

    public void setHeadUnit(String headUnit) {
        this.headUnit = headUnit;
    }

}
