#include<iostream>
using namespace std;
int main()
{
  int n,m,sum,div=0,i=1;
  cin>>n>>m;
  sum=n+m;
  while (i<sum)
  {
    if (sum%i==0)
    {
      div=div+i;
    }
    i++;
  }
  if (div==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}