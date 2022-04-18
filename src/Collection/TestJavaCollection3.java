/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;

public class TestJavaCollection3 {

    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Adi");//Adding object in vector 
        v.add("Putra");
        v.add("Tari");
        v.add("Syila");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
