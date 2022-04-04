/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HHR
 */
public class Sekretaris extends Pegawai {
    String divisi;
    public Sekretaris(String nama, double gaji, String divisi){
    super(nama,gaji);
    this.divisi=divisi;
        System.out.println("Construktor Child");
    }
    @Override
    public void print(){
        super.print();
        System.out.println("divisi:"+divisi);
    }   
    
}
