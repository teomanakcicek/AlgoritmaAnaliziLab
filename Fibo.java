
package fibo;


public class Fibo {
    
    public static long fiboDinamik(int t){
        long fib[]=new long[t+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<t+1;i++){             //karmasiklik  O(n)
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[t];
    }

    
    public static void main(String[] args) {
        final long st=System.currentTimeMillis();
        System.out.println(fiboDinamik(100000));
        final long et=System.currentTimeMillis();
        System.out.println("\n exe time : "+(et-st));
    }
    
}
