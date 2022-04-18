/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;

public class TestJavaCollection2 {

    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Adi");//Adding object in arraylist  
        al.add("Putra");
        al.add("Tari");
        al.add("Syila");
        al.addFirst("Indri");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
