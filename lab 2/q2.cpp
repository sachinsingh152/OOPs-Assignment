#include<iostream>
using namespace std;
class employee{
   string name;
   int code;
   string adress;
   int account;
   int date;
   int pay;
   int deduct;

   public:
   static int count;
   employee(){
    this->name="sachin";
    this->code=3;
    this->adress="up";
    this->account=2;
    this->date=20;
    this->pay=100000;
    this->deduct=34444;
    count++;
   }
   employee(string name,int code,string adress,int account,int date,int pay,int deduct){
    this->name=name;
    this->code=code;
    this->adress=adress;
    this->account=account;
    this->date=date;
    this->pay=pay;
    this->deduct=deduct;
    count++;
   }
   employee(employee &s){
     name=s.name;
     code=s.code;
     adress=s.adress;
     account=s.account;
     date=s.date;
     pay=s.pay;
     deduct=s.deduct;
     count++;
   }
   ~employee(){
    cout<<"default deconstructor"<<endl;
   }
   friend void print(employee &s);

};
inline void print(employee &s){
    cout<<"employee name"<<s.name<<endl<<"employee code"<<s.code<<endl<<"adress "<<s.adress<<endl<<"account"<<s.account<<endl<<"date"<<s.date<<endl<<s.count<<endl;
}
int employee:: count=0;
int main(){
    employee a;
    print(a);
    employee b("aa",2,"ss",45,34,100000,200000);
    print(b);
    return 0;
}