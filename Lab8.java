

package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lab8 {
    
    public static double average(ArrayList<Integer> list){ 
        double toplam=0;
        for(int i=0;i<list.size();i++){
            toplam=toplam+list.get(i);
        }
        double ort=toplam/list.size();
        return ort;
    } 
    public static double var(ArrayList<Integer> list){
        double var=0;
        double ort=average(list);
        for(int i=0;i<list.size();i++){
            var+=(list.get(i)-ort)*(list.get(i)-ort);
        }
        var/=list.size()-1;
        return var;
    }
    
    public static double standartSapma(ArrayList<Integer> list){
        double var=0;
        double ort=average(list);
        for(int i=0;i<list.size();i++){
            var+=(list.get(i)-ort)*(list.get(i)-ort);
        }
        var/=list.size()-1;
        return Math.sqrt(var);
    }
    
    public static double normalDagilim(ArrayList<Integer> list,int x){
        double d = 1/ Math.sqrt(2*3.14*Math.pow(standartSapma(list),2));    //n karmasiklik
        return d*Math.exp(-1*(Math.pow(x-average(list),2)/(2*Math.pow(standartSapma(list),2)))); // n+n karmasiklik
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(22);
        list1.add(5);
        list1.add(16);
        list1.add(32);
        int x=5;
        System.out.println("min: "+Collections.min(list1)); //karmasiklik=>O(n)
        System.out.println("max: "+Collections.max(list1)); //karmasiklik=>O(n)
        System.out.println("average: "+average(list1)); //karmasiklik=>O(n)
        System.out.println("varyans: "+var(list1)); //karmasiklik=>O(n)
        System.out.println("standart sapma: "+standartSapma(list1)); //karmasiklik=>O(n)
        System.out.println("normal dagilim: "+normalDagilim(list1, x));//karmasiklik=>O(n)
    }
    
}
