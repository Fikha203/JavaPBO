/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

/**
 *
 * @author HHR
 */
import java.util.*;

class TreeMap1 {

    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Tari");
        map.put(102, "Syila");
        map.put(101, "Putra");
        map.put(103, "Adi");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
