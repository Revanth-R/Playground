#include<iostream>
using namespace std;
int main()
{
  char a[200];
  cin>>a;
  int b, count=0;
  while (a[count])
    count++;
  for (int i=0; i<count; i++){
    b=int(a[i]);
    if (b>=65 && b<=90)
      cout<<a[i];
    else if (b>=97 && b<=122)
      cout<<a[i];}
}