#include<iostream>
using namespace std;
int sum(int n){
  int sum = 0;
  while(n > 0 || sum > 9) 
    {
    if(n == 0)
    {
      n = sum;
      sum = 0;
    }
    sum += n % 10;
    n /= 10; 
    } 
    return sum; 
}
int main()
{
  int a;
  cin>>a;
  cout<<sum(a);
}