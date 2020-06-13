#include<iostream>
using namespace std;
int fib(int a){
  if (a==0 || a==1)
    return 1;
  else
    return fib(a-1)+fib(a-2);}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-2);
}