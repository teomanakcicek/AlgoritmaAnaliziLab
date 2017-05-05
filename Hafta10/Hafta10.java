
package hafta10;

import java.util.Random;

public class Hafta10 {

    public static void main(String[] args) {
        Random r=new Random();
        int [][]m=new int[3][3];
        int []t=new int[3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=1+r.nextInt(9);     //karmasiklik O(n**2)dir

            }
            t[i]=1+r.nextInt(9); 
        }

        System.out.println("Matris");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");      //karmasiklik O(n**2)dir
                
            }
            System.out.println();
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                m[i][j]=0;                      //karmasiklik O(n**2)dir
            }
        }
        
        System.out.println("Ust Ucgen Matris");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j]+" ");      //karmasiklik O(n**2)dir

            }
            System.out.println();
        }
        System.out.println("t matrisi");
        for(int i=0;i<3;i++){
            System.out.println(t[i]);
        }
        int x[]=new int[3];
     
        
       x[2]=t[2]/m[2][2];
       x[1] = (t[1]-(m[1][2]*x[2]))/m[1][1];
       x[0] = (t[1]-(m[0][2]*x[2])-(m[0][1]*x[1]))/m[0][0];
        
         System.out.println("x matrisi");
        for (int i = 0; i < 3; i++) {
            System.out.println(x[i]);
        }
        for(int i=0;i<3;i++){
            
        }
    }
    
}
//programın karmasikligi O(n**2) olmus olur...

