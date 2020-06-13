#include<iostream>
int main()
{
  int n,times=0;
  std::cin>>n;
  do{
    n=n/10;
    times++;
  }while(n>0);
  std::cout<<times;
}