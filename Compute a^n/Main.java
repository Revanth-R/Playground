#include<iostream>
using namespace std;
int power(int a, int b){
  if (b==1)
    return a;
  else
    return a*power(a,b-1);
}
int main()
{
  int a,b;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<endl<<"Enter the value of n";
  cin>>b;
  cout<<endl<<"The value of "<<a<<" power "<<b<<" is "<<power(a,b);
}