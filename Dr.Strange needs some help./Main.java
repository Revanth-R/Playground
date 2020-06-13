#include<iostream>
using namespace std;
int main()
{
  int base,exp,req,res=1;
  cin>>base>>exp>>req;
  while (exp!=0){
    res*=base;
    --exp;}
  if (res>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}