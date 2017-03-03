#include <cstdlib>
#include <iostream>

using namespace std;
int sayac=0;
long long power(long long a,long long b){
    long long toplam=1;   //2
    for(int i=0;i<b;i++){//2 1 2
        sayac++;
        toplam*=a;      //2
    }
    return toplam;  //2+2+toplamsembolu b i=0 5 ten ihmallerden sonra O(n) cykty karmasyklyk
}

int main()
{
    long long sonuc=power(2,60);
    cout<<sonuc<<" "<<sayac;
    system("PAUSE");
    return EXIT_SUCCESS;
}
