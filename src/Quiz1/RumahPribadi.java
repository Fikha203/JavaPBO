/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;

/**
 *
 * @author HHR
 */
public class RumahPribadi extends Property {

    private int kamarTidur;


    public RumahPribadi(String luasTanah, String luasBangunan, int tinggi, int kamarMandi, String harga, int kamarTidur) {
        super(luasTanah, luasBangunan, tinggi, kamarMandi, harga);
        this.kamarTidur = kamarTidur;
    }

    public int getKamarTidur() {
        return this.kamarTidur;
    }

    public void setKamarTidur(int kamarTidur) {
        this.kamarTidur = kamarTidur;
    }

    @Override
    public void printData() {
        System.out.println("==========Data Rumah Pribadi==========");
        super.printData();
        System.out.println("Jumlah Kamar Tidur\t: " + this.getKamarTidur());
    }
    
    public void pajakRumah(){
        System.out.println("Total Pajak\t\t: 5 juta");
    }

}
