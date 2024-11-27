#include<iostream>
using namespace std;
class class_2;
class class_1{
     int a;
     public:
     class_1(int a){
        this->a=a;
     }
     void display(){
        cout<<"the no in class_1 is  "<<a<<endl;
     }
     friend void exchange(class_1 &A,class_2 &B);
};
class class_2{
   int b;
   public:
   class_2(int b){
    this->b=b;
   }
   void display(){
    cout<<"the number in class_2 is  "<<b<<endl;
   }
     friend void exchange(class_1 &A,class_2 &B);
};
void exchange(class_1 &A,class_2 &B){
    int temp=A.a;
    A.a=B.b;
    B.b=temp;
}
int main(){
    class_1 A(4);
    class_2 B(5);
    exchange(A,B);
    A.display();
    B.display(); 
    return 0;
}