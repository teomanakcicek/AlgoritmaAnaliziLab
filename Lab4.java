

package lab4;

import java.util.Arrays;
import java.util.ArrayList;

class myClass{
    int kapasite=5;
    int size=0;
    int dizi[]=new int[5];
    public void elemanEkle(int sayi){
        if(kapasiteKontrol()){
            dizi[size]=sayi;
        }
        else{
            int tempDizi[]=new int[kapasite];
            kapasite=kapasite*2;
            for(int i=0;i<size;i++){
                tempDizi[i]=dizi[i];
            }
            dizi=new int[kapasite];
            dizi=Arrays.copyOfRange(tempDizi, 0, kapasite);
            dizi[size]=sayi;
        }
        size++;
    }
    
    //Add fonkisyonunun karmaşıklığı O(n)dir.
    public boolean kapasiteKontrol(){
        if(kapasite>size){
            return true;
        }
        else{
            return false;
        }
    }
    
}

public class Lab4 {
    
    public static void main(String[] args) {
        myClass myClass= new myClass();
        myClass myClass2;
        
        for(int i=2;i<100;i++){
            myClass.elemanEkle(i);
        }
        myClass2=myClass;
        //shallow copy yapılıyor O(1)dir.
    }
    
}
