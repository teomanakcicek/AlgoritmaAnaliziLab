
package hafta9;

import java.util.ArrayList;
import java.util.List;


public class Hafta9 {

    
    public static void main(String[] args) {
       List<Integer> v1 = new ArrayList<Integer>();
       List<Integer> v2 = new ArrayList<Integer>();
       v1.add(1);
       v1.add(2);
       v1.add(3);
        v2.add(2);
       v2.add(4);
       v2.add(6);
       int carpim=0;
        for (int i = 0; i < v1.size(); i++) {   //karmasiklik O(n)
            carpim+=(v1.get(i)*v2.get(i));
        }
        System.out.println(carpim);
    }
    
}
