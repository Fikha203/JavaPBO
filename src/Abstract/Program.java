/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author HHR
 */
class Program {

    public static void main(String[] args) {
        Persegi psg = new Persegi(3);
        PersegiPanjang psgpjg = new PersegiPanjang(5, 7);
        psg.cetak();
        System.out.println("Rumus Persegi\n=====");
        System.out.println("Luas Persegi     : " + psg.luas());
        System.out.println("Keliling Persegi : " + psg.keliling());
        psgpjg.cetak();
        System.out.println("Rumus Persegi Panjang\n=====");
        System.out.println("Luas Persegi Panjang     : " + psgpjg.luas());

        System.out.println("Keliling Persegi Panjang : " + psgpjg.keliling());
        
    }
}
