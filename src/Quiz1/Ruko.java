package Quiz1;

public class Ruko extends Property {

    private boolean displayProduk;
    private boolean wastafel;
    private boolean ruangParkir;
    private boolean kanopi;


    public Ruko(String luasTanah, String luasBangunan, int tinggi, int kamarMandi, String harga,
            boolean displayProduk, boolean wastafel, boolean ruangParkir, boolean kanopi) {
        super(luasTanah, luasBangunan, tinggi, kamarMandi, harga);
        this.displayProduk = displayProduk;
        this.wastafel = wastafel;
        this.ruangParkir = ruangParkir;
        this.kanopi = kanopi;
    }

    public boolean getDisplayProduk() {
        return this.displayProduk;
    }

    public void setDisplayProduk(boolean displayProduk) {
        this.displayProduk = displayProduk;
    }
    public boolean getWastafel() {
        return this.wastafel;
    }

    public void setWastafel(boolean wastafel) {
        this.wastafel = wastafel;
    }
    public boolean getRunagParkir() {
        return this.ruangParkir;
    }

    public void setRuangParkir(boolean ruangParkir) {
        this.ruangParkir = ruangParkir;
    }
    public boolean getKanopi() {
        return this.kanopi;
    }

    public void setKanopi(boolean kanopi) {
        this.kanopi = kanopi;
    }

    

    @Override
    public void printData() {
        System.out.println("==========Data Ruko====================");
        super.printData();
        System.out.println("Ruang Display Produk\t: " + this.getDisplayProduk());
        System.out.println("Wastafel\t\t: " + this.getWastafel());
        System.out.println("Ruang Parkir\t\t: " + this.getRunagParkir());
        System.out.println("Kanopi\t\t\t: " + this.getKanopi());
    }
    public void pajakRuko(){
        System.out.println("Total Pajak\t\t: 10 juta");
    }
}
