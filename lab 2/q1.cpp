#include<iostream>
using namespace std;
class employee{
   string name;
   int code;
   string adress;
   int year;
   int age;
   public:
   static int count;
   employee(){
    this->name="sachin";
    this->code=3;
    this->adress="up";
    this->year=2;
    this->age=20;
    count++;
   }
   employee(string name,int code,string adress,int year,int age){
    this->name=name;
    this->code=code;
    this->adress=adress;
    this->year=year;
    this->age=age;
    count++;
   }
   employee(employee &s){
     name=s.name;
     code=s.code;
     adress=s.adress;
     year=s.year;
     age=s.age;
     count++;
   }
   ~employee(){
    cout<<"default deconstructor"<<endl;
   }
   friend void print(employee &s);

};
 inline void print(employee &s){
    cout<<s.name<<endl<<s.code<<endl<<s.adress<<endl<<s.year<<endl<<s.age<<endl<<s.count<<endl;
}
int employee:: count=0;
int main(){
    employee a;
    print(a);
    employee b("aa",2,"ss",45,34);
    print(b);
    return 0;
}