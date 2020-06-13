#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0;    
std::cin.getline(str, 100);
while (str[count]){
  count++;}
for (int i=0; i<count; i++)
  rev[i]=str[i];
for (int i=0; i<count; i++){
  str[i]=rev[count-i-1];
  std::cout<<str[i];}
}