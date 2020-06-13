#include <iostream>
using namespace std;
int main() {
    int n,a=1;
  	cin>>n;
  	for (int i=1; i<=n; i++){
      if (a%2!=0){
        for (int j=1; j<=(n-1); j++){
          cout<<i;}
        a=i+1;
        cout<<a<<endl;}
      else{
        cout<<a+1;
        for (int j=1; j<=(n-1); j++){
          cout<<a;}
      	cout<<endl;
      a++;}
    }
    return 0;
}