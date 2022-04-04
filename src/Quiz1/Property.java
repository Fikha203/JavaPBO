/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz1;

/**
 *
 * @author HHR
 */
public class Property extends PropertyAbstract {

    private String luasTanah;
    private String luasBangunan;
    private int tinggi;
    private String harga;
    private int kamarMandi;

    public Property(String luasTanah, String luasBangunan, int tinggi,int kamarMandi, String harga) {
        this.luasTanah = luasTanah;
        this.luasBangunan = luasBangunan;
        this.tinggi = tinggi;
        this.kamarMandi = kamarMandi;
        this.harga = harga;
    }

    public void setLuasTanah(String luasTanah) {
        this.luasTanah = luasTanah;
    }

    @Override
    public String getLuasTanah() {
        return this.luasTanah;
    }

    public void setLuasBangunan(String luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    @Override
    public String getLuasBangunan() {
        return this.luasBangunan;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public int getTinggi() {
        return this.tinggi;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String getHarga() {
        return this.harga;
    }

    public int getKamarMandi() {
        return this.kamarMandi;
    }

    public void setKamarMandi(int kamarMandi) {
        this.kamarMandi = kamarMandi;
    }

    @Override
    public void printData() {
        System.out.println("Luas Tanah\t\t: " + this.getLuasTanah());
        System.out.println("Luas Bangunan\t\t: " + this.getLuasBangunan());
        System.out.println("Tinggi bangunan\t\t: " + this.getTinggi() + " Lantai");
        System.out.println("Jumlah Kamar mandi\t: " + this.getKamarMandi());
        System.out.println("Harga\t\t\t: " + this.getHarga());
    }

}
