/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

import java.util.*;

/**
 *
 * @author HHR
 */
public class MapExample1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        //Adding elements to map  
        map.put(1, "Adi");
        map.put(5, "Putra");
        map.put(2, "Tari");
        map.put(6, "Syila");
        //Traversing Map  
        Set set = map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
