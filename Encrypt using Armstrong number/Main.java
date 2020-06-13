#include<iostream>
int power(int m,int o)
{
    int j,i;
    for(i=1,j=1;i<=o;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int a = 0,sep,sum = 0,tb = n;
    int temp = n;
  	while (temp!=0){
      temp = temp / 10;
      a++;}
  	while (tb!=0){
      sep = tb % 10;
      sum = sum + power (sep,a);
      tb = tb / 10;
    }
  	if (n==sum)
      return 1;
  	else 
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}