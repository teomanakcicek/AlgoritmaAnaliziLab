/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logn;

/**
 *import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 * @author teoma
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Logn {

    /**
     * @param args the command line arguments
     */
      static int findMid(int dizi[])
    {
        int orta=dizi.length/2;
        int sumLeftMax=0;
        int sumLeft=0;
        for (int i = orta-1; i > -1; i--) {
            sumLeft+=dizi[i];
            if (sumLeft>sumLeftMax) {
                sumLeftMax=sumLeft;
            }
        }
        int sumRightMax=0;
        int sumRight=0;
        for (int i = orta; i < dizi.length; i++) {
            sumRight+=dizi[i];
            if (sumRight>sumRightMax) {
                sumRightMax=sumRight;
            }
        }
        return sumLeftMax+sumRightMax;
    }
  static int enBuyuk(int a,int b,int c){
    if (a>b){
        if (b>c){
            return a;
        }
        else if (a>c){
            return a;
        }
        else{
            return c;
        }
    }
    else if( b>c){
        return b;
    }
    else{
        return c;
    }
  }
    static int diziElemanTopla(int dizi[])
    {
        int sum=0;
        for (int i : dizi)
            sum += i;
        return sum;
    }
   static int sumLeft=0,sumRight=0,sumMidle=0;
    static int maxToplam(int dizi[] ){
   
    if(dizi.length<2)
    {
        return diziElemanTopla(dizi);
    }
    else
    {
        int middle=(dizi.length)/2;
        
        sumLeft=maxToplam(Arrays.copyOfRange(dizi, 0, middle));
        sumRight=maxToplam(Arrays.copyOfRange(dizi, middle,dizi.length));
        sumMidle=findMid(dizi);
    }
   return enBuyuk(sumLeft,sumRight,sumMidle);
  }
    public static void main(String[] args) {
        int[] dizi = new int[1000000];
        for (int i=0; i<1000000; i++){
        int n = (int)(Math.random()*65535  - 32768);
        dizi[i] = n;
       }
        
        final long startTime = System.currentTimeMillis();
        int result=maxToplam(dizi);
        System.out.println(result);
        final long endTime = System.currentTimeMillis();
        System.out.println("Toplam Calisma Suresi: " + (endTime - startTime) );
    }
    
}
