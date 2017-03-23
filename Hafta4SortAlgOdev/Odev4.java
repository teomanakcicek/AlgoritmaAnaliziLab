
package odev4;


public class Odev4 {
    
    static int n=1000;
    private static int array[];
    private static int length;

   public static int[]  BubbleSort(int dizi[]) {
        int n = dizi.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (dizi[i] > dizi[k]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[k];
                    dizi[k] = temp;
                }
            }       
        }
        return dizi;
    }
    
   public static int[] SelectionSort(int[] dizi){
         
        for (int i = 0; i < dizi.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++)
                if (dizi[j] < dizi[index])
                    index = j;
      
            int kSayi = dizi[index]; 
            dizi[index] = dizi[i];
            dizi[i] = kSayi;
        }
        return dizi;
    }
   
   public static int[] InsertionSort(int[] dizi){
         
        int temp;
        for (int i = 1; i < dizi.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(dizi[j] < dizi[j-1]){
                    temp = dizi[j];
                    dizi[j] = dizi[j-1];
                    dizi[j-1] = temp;
                }
            }
        }
        return dizi;
    }
   
   public static void sort(int[] dizi) {
         
        if (dizi == null || dizi.length == 0) {
            return;
        }
        array = dizi;
        length = dizi.length;
        QuickSort(0, length - 1);
    }
    
   public static void QuickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                sayiDegis(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            QuickSort(lowerIndex, j);
        if (i < higherIndex)
            QuickSort(i, higherIndex);
    }
    
   public static void sayiDegis(int i, int j) {
        int gecici = array[i];
        array[i] = array[j];
        array[j] = gecici;
    }
    
    public static void BubbleSortYazdir()
    {
         int[] dizi = new int[n];
        for (int i=0; i<n; i++){
        int n = (int)(Math.random()*65535  - 32768);
        dizi[i] = n;
       }    
        final long startTime = System.currentTimeMillis();
        int[] arr2 = BubbleSort(dizi);
        final long endTime = System.currentTimeMillis();
        for(int i:arr2){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n Bubble Sort Calisma Zamani: " + (endTime - startTime) );
    }
    
    public static void SelectionSortYazdir()
    {
         int[] dizi = new int[n];
        for (int i=0; i<n; i++){
        int n = (int)(Math.random()*65535  - 32768);
        dizi[i] = n;
       }    
        final long startTime = System.currentTimeMillis();
        int[] arr2 = SelectionSort(dizi);
        final long endTime = System.currentTimeMillis();
        for(int i:arr2){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n Selection Sort Calisma Zamani: " + (endTime - startTime) );
    }
    
    public static void InsertionSortYazdir()
    {
         int[] dizi = new int[n];
        for (int i=0; i<n; i++){
        int n = (int)(Math.random()*65535  - 32768);
        dizi[i] = n;
       }    
        final long startTime = System.currentTimeMillis();
        int[] arr2 = InsertionSort(dizi);
        final long endTime = System.currentTimeMillis();
        for(int i:arr2){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n Insertion Sort Calisma Zamani: " + (endTime - startTime) );
    }
    
    public static void QuickSortYazdir()
    {
         int[] dizi = new int[n];
        for (int i=0; i<n; i++){
        int n = (int)(Math.random()*65535  - 32768);
        dizi[i] = n;
       }    
        final long startTime = System.currentTimeMillis();
        sort(dizi);
        final long endTime = System.currentTimeMillis();
        for(int i:dizi){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n Quick Sort Calisma Zamani: " + (endTime - startTime) );
    }
    
    public static void main(String[] args) {
       BubbleSortYazdir();
       SelectionSortYazdir();
       InsertionSortYazdir();
       QuickSortYazdir();
    }
}
