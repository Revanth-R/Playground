#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student a;
  cin.getline(a.name, 50);
  cin>>a.roll>>a.marks;
  cout<<endl<<"Student Details"<<endl;
  cout<<"Name: "<<a.name<<endl;
  cout<<"Roll: "<<a.roll<<endl;
  cout<<"Marks: "<<a.marks;
}