#include<iostream>
using namespace std;
int main()
{
  int n,temp,rem,sum=0;
  cin>>n;
  temp=n;
  while (temp!=0){
    rem=temp%10;
    sum=sum+rem;
    temp=temp/10;}
  if (n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}