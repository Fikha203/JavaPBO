package Collection;

import java.util.*;

class TestJavaCollection1 {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
        list.add("Adi");//Adding object in arraylist  
        list.add("Putra");
        list.add("Tari");
        list.add("Syila");
        list.remove("Tari");
        Iterator itr = list.iterator();//Traversing list through Iterator  
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
