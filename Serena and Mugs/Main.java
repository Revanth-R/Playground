#include<iostream>
using namespace std;
int main()
{
  int m,c,sum=0;
  int vol[10];
  cin>>m>>c;
  for (int i=0; i<m; i++)
    cin>>vol[i];
  for (int i=0; i<m; i++)
    sum+=vol[i];
  if (sum<=c)
    cout<<"YES";
  else
    cout<<"NO";
}