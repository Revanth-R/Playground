#include<iostream>
using namespace std;
int main()
{
  int n, i;
  float a=0.5;
  cin>>n;
  cout<<a;
  for (i=1; i<n; i++){
    a*=3;
    cout<<" "<<a;}
}