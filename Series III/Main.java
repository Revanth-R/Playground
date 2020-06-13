#include<iostream>
using namespace std;
int main()
{
  int n, i, a=6, b=5;
  cin>>n;
  cout<<a;
  for (i=1; i<n; i++){
    a=a+b*i;
    cout<<" "<<a;}
}