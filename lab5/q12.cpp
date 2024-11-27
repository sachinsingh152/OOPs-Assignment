#include<iostream>
using namespace std;
class integer{
 int a;
 public:
 integer(int a){
  this->a=a;
 }
 friend integer  operator+(integer &A,integer &B);
 void display(){
    cout<<"the no is "<<a<<endl;
 }
};
  integer  operator+(integer &A,integer &B){
    integer C(A.a+B.a);
    return C;
  }

int main(){
    integer a(4),b(5);
    integer c=a+b;
    c.display();
    return 0;
}