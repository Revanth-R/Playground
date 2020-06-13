#include <cstring>
#include <iostream>
int main()
{
  char a[200];
  std::cin.getline(a, 200);
  int b, count = 0;
  int len = strlen(a);
  for (int i=0; i<len; i++){
    b = int(a[i]);
    if (b==32)
      count++;
    else
      continue;
  }
  if (count<=10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}