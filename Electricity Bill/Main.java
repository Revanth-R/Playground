#include<iostream>
int main()
{
  int unit,fare;
  float i;
  std::cin>>unit;
  if (unit<=200){
  	i=0.5;
    fare=unit*i;
  	std::cout<<"Rs."<<fare;}
  else if (unit<=400){
  	i=0.65;
    fare=(unit*i)+100;
  	std::cout<<"Rs."<<fare;}
  else if (unit<=600){
  	i=0.80;
    fare=(unit*i)+200;
  	std::cout<<"Rs."<<fare;}
  else{
  	i=1.25;
    fare=(unit*i)+425;
  	std::cout<<"Rs."<<fare;}
}