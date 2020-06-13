#include<iostream>
using namespace std;
int main()
{
  char a[50], b[50], rev[50];
  cin>>a>>b;
  int n, count=0;
  while (a[count])
    count++;
  for (int i=0; i<count; i++)
    rev[i]=a[count-i-1];
  for (int i=0; i<count; i++){
    if (b[i]==rev[i])
      n=1;
    else{
      n=0;
      break;}
  }
  if (n==1)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}