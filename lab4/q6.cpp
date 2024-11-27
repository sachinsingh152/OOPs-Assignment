#include<iostream>
using namespace std;
class B;
class A{
  float a;
  public:
  A(int a){
    this->a=a;
  }
   friend void avg(A a,B b); 
};
class B{
    float b;
    public:
    B(int b){
        this->b=b;
    }
   friend void avg(A a,B b);    
};
void avg(A a,B b){
    float avge;
    avge=(a.a+b.b)/2;
    cout<<"the average of the no is :"<<avge<<endl;
}
int main(){
    A a(10);
    B b(13);
    avg(a,b);
    return 0;
}