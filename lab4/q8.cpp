#include<iostream>
using namespace std;
class complex{
  int real;
  int img;
  public:
  complex(){
     this->img=0;
     this->real=0;
  }
  complex(int real,int img){
    this->img=img;
    this->real=real;
  }
  inline void multiply(complex *b);
};
void complex::multiply(complex *b){
    complex res;
    res.real=(this->real)*(b->real)-(this->img)*(b->img);
    res.img=(this->img)*(b->real)+(this->real)*(b->img);
    cout<<"the multiplication of the complex is :"<<res.real<<" + "<<res.img<<"i"<<endl;
}
int main(){
    complex a(5,6);
    complex b(4,5);
    a.multiply(&b);
    return 0;
}