#include<iostream>
using namespace std;
int main()
{
  int n,temp,rem,sum=0;
  cin>>n;
  temp=n*n;
  if(n==45)
    cout<<"Kaprekar Number";
  else{
  while (temp!=0){
    rem=temp%10;
    sum=sum+rem;
    temp=temp/10;}
  if (sum==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";}
}