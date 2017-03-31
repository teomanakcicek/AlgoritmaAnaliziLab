

package vizedenoncesonhafta;


public class VizedenOnceSonHafta {

    
public static long power62(long x){
    long x1=x*x*x;
    long x2=x1*x1;
    long x3=x2*x2*x1;
    long x4=x3*x3*x;
    long x5=x4*x4;
    return x5;
}

    public static void main(String[] args) {
        long sonuc=power62(2);
        System.out.println("sonuc :"+sonuc);
    }
    
}
