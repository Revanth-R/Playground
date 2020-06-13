#include<iostream>
using namespace std;
int main()
{
  int n,b;
  cin>>n;
  int a[n];
  for (int i=0;i<n;i++)
    cin>>a[i];
  cin>>b;
  for (int i=0;i<n;i++){
    if (a[i]==b){
      cout<<"She passed her exam";
      n=0;
      break;}}
  if (n!=0)
    cout<<"She failed";
}