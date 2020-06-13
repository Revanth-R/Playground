#include<iostream>
using namespace std;
int main()
{
  int w,a,c,t;
  std::cin>>w>>a>>c;
  t=(a*75)+(c*30);
  if (t<=500)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}