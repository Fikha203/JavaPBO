/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StakTraceElement;

/**
 *
 * @author user
 */
public class DivByZero {
    public static void main(String[] args) {
        try{
            pembagian();
        }catch(ArithmeticException ae){
            StackTraceElement[] se=ae.getStackTrace();
            for (int i = 0; i < se.length; i++) {
                System.out.println("Nama Class:"+se[i].getClassName()); 
                System.out.println("Nama Method:"+se[i].getMethodName()); 
                System.out.println("Nama File:"+se[i].getFileName()); 
                System.out.println("Nama Module:"+se[i].getModuleName()); 
            }
        } 
    }    
    static void pembagian(){
    int i=10/0;
    }
}

