#include<iostream>
using namespace std;
int main()
{
  char a[50], b[50];
  cin>>a>>b;
  int n, count=0;
  while (a[count])
    count++;
  for (int i=0; i<count; i++){
    if(a[i]==b[i])
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