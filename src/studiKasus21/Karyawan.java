/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiKasus21;

/**
 *
 * @author HHR
 */
public class Karyawan {

    private String nama;
    private int umur;
    private String alamat;
    private String noTelp;
    private String kelamin;
    private String kategori;

    public Karyawan(String nama, int umur, String alamat, String noTelp, String kelamin, String kategori) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.kelamin = kelamin;
        this.kategori = kategori;
    }

    public void print() {
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("noTelp : " + noTelp);
        System.out.println("kelamin : " + kelamin);
        System.out.println("kategori : " + kategori);
    }
}
