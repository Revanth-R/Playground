#include<iostream>
using namespace std;
int main()
{
  int n, a=121, b=11;
  cin>>n;
  cout<<a;
  for (int i=1; i<n; i++){
    b=b+4;
    a=b*b;
    cout<<" "<<a;}
}