#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float i;
  while (cin>>n){
  if (n>0){
   if (n%2!=0)
     i+=1.0;
   else
     i-=0.5;
  }
  else{
    i-=1;
    break;
  }
  }
  cout<<i;
}