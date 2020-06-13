#include<iostream>
using namespace std;
int main()
{
  char a[200];
  cin.getline(a, 200);
  int b, count=0, vow=0, con=0, space=0, dig=0, sym=0;
  while (a[count])
    count++;
  for (int i=0; i<count; i++){
    b=int(a[i]);
    if (b==32){
      space++;
      continue;}
    else if (b<=57 && b>=48){
      dig++;
      continue;}
    else if (b<=47 && b>=33){
      sym++;
      continue;}
    else if (b>=58 && b<=64){
      sym++;
      continue;}
    else if (b==65 || b==69 || b==73 || b==79 || b==85){
      vow++;
      continue;}
    else if (b==97 || b==101 || b==105 || b==111 || b==117 ){
      vow++;
      continue;}
    else{
      con++;
      continue;}
    }
  cout<<"Vowels:"<<vow<<endl;
  cout<<"Consonants:"<<con<<endl;
  cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym<<endl;
}