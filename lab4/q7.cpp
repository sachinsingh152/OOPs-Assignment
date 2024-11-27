#include<iostream>
using namespace std;
class cuboid{
 int h,b,l,are;
 public:
 cuboid(int h,int b,int l){
    this->h=h;
    this->b=b;
    this->l=l;
 }
 void area(){
    are=2*(l*b+b*h+h*l);

 }
 void display(){
    cout<<"the area of the cuboid is :"<<are<<endl;
 }
 friend class cube;
};
class cube{
   int a,vol;
   public:
   cube(int a){
    this->a=a;
   }
   void volume(){
     vol=a*a*a;
   }
   void displ(cuboid a){
    a.display();
    cout<<"the volume of the cube is :"<<vol<<endl;
   }
};
int main(){
    cuboid a(4,5,6);
    a.area();
    cube b(4);
    b.volume();
    b.displ(a);
    return 0;
}