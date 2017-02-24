#include <iostream>

using namespace std;

int power(int a,int b){
    int toplam=1;   //2
    for(int i=0;i<b;i++){//2 1 2
        toplam*=a;      //2
    }
    return toplam;  //2+2+toplamsembolu b i=0 5 ten ihmallerden sonra O(n) cýktý karmasýklýk
}

int main()
{
    int sonuc=power(2,4);
    cout<<sonuc;
    return 0;
}
