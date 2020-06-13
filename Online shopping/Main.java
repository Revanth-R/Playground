#include<iostream>
using namespace std;
int main()
{
  int a,b,c,p,q,r,x,y,z,f,s,ama,d,t,e;
  cin>>a>>b>>c>>p>>q>>r>>x>>y>>z;
  d=(a*b)/100;
  t=(p*q)/100;
  e=(x*y)/100;
  f=a-d+c;
  s=p-t+r;
  ama=x-e+z;
  cout<<"In Flipkart Rs."<<f<<"\nIn Snapdeal Rs."<<s<<"\nIn Amazon Rs."<<ama<<endl;
  if (f<=s && f<ama)
    cout<<"He will prefer Flipkart";
  else if (s<f && s<ama)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}