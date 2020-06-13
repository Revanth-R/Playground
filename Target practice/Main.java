#include<iostream>
using namespace std;
int main()
{
  int target,n=0,m,i=0;
  cin>>target;
  while (n<target){
    cin>>m;
    n=n+m;
    i++;
  }
  cout<<"The number of turns is "<<i;
}