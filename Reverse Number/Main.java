#include <iostream>
int main() 
{
  int n,rev=0,i=0;
  std::cin>>n;
  while (n>0)
  {
    rev=rev*10;
    i=n%10;
    n=n/10;
    rev=rev+i;
  }
  std::cout<<rev;
  return 0;
}