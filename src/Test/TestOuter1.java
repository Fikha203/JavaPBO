/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author HHR
 */
class TestOuter1 {

    static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();
    }
}
