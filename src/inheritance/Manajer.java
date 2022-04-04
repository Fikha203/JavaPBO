/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;


public class Manajer extends Pegawai {

    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("departemen: " + departemen);
    }
    
    public void manage(){
        System.out.println("manage pekerjaan");
    
    }

}
