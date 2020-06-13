#include<iostream>
using namespace std;
int main()
{
  int i = 1, n, m, u = 1, sum = 0;
  cin>>m>>n;
  i=m;
  while (i <= n) 
  {
    while (u <= n) 
    {
      if (u < i) 
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
}