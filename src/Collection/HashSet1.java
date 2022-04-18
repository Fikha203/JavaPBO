/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author HHR
 */
import java.util.*;
class HashSet1 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet();
        set.add("Adi");
        set.add("Putra");
        set.add("Tari");
        set.add("Syila");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
 
