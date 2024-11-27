#include<iostream>
using namespace std;
class vector{
  int a;
  public:
  friend void operator>>(istream &mycin,vector &A);
  friend void operator<<(ostream &mycout,vector &A);
  friend vector operator+(vector &A,vector &B);
  friend vector operator-(vector &A,vector &B);
};
   void operator>>(istream &mycin,vector &A){
      mycin>>A.a;
  }
     void operator<<(ostream &mycout,vector &A){
        mycout<<"the number is "<<A.a<<endl;
     }
   vector operator+(vector &A,vector &B){
        vector c;
        c.a=A.a+B.a;
        return c;
  }
   vector operator-(vector &A,vector &B){
        vector c;
        c.a=A.a-B.a;
        return c;
   }

  

int main(){
    vector A,B,C,D;
    cin>>A;
    cin>>B;
    cout<<A;
    cout<<B;
    C=A+B;
    D=A-B;
    cout<<C;
    cout<<D;
    return 0;
}