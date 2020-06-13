#include<iostream>
using namespace std;
int main()
{
  int n, i, j;
  cin>>n;
  for (i=0; i<4; i++){
    for (j=0; j<=i; j++){
      cout<<n;}
    n++;
    cout<<endl;}
  n--;
  for (int i=4; i>=1; i--){
    for (int j=1; j<=i; j++){
      cout<<n;}
    n--;
    cout<<endl;}
}