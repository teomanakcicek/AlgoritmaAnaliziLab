#include <cstdlib>
#include <iostream>

using namespace std;
int sayac=0;
long long power(long long x,long long n){
     sayac++;
     if(n==0)  return 1;
     if(n==1)  return x;
     if(n%2==0)    return power(x*(long long)x,n/2);
     else          return power(x*(long long)x,n/2)*x;          
     }

int main(int argc, char *argv[])
{
    long long sonuc=power(2,60);
    cout<<sonuc<<" "<<sayac;
    system("PAUSE");
    return EXIT_SUCCESS;
}
