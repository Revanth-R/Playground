#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,*p,a,b;
  cin>>n;
  p= (int*) malloc(n*sizeof(int));
  for (int i=0; i<n; i++)
    cin>>*(p+i);
  for (int i=0; i<n; i++){
    if (p[i]%2!=0)
      a+=1;
    else
      b+=1;}
  cout<<a<<endl<<b;
  free(p);
  return 0;
}