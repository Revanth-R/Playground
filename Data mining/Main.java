#include<iostream>
using namespace std;
int main()
{
  int n,temp,o=0,e=0,rem;
  cin>>n;
  temp=n;
  while (temp!=0){
    rem=temp%10;
    if (rem%2==0)
      e+=rem;
    else
      o+=rem;
    temp=temp/10;
  }
  if (o==e)
    cout<<"Yes";
  else
    cout<<"No";
}