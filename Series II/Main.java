#include<iostream>
using namespace std;
int main()
{
  int n, i;
  int a=121, b=11;
  cin>>n;
  cout<<a;
  for (i=1; i<n; i++){
    b=b+4;
    a=b*b;
    cout<<" "<<a;}
}