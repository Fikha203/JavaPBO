/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author HHR
 */
public class DivByZero {

    public static void main(String[] args) {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("tidak boleh ada pembagian dengan nol");
            //System.out.println(ae.getMessage());
            //ae.printStackTrace();
        } finally {
            System.out.println("blok finally");
        }
        System.out.println("program Devide by Zero");
    }
}
