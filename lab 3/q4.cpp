#include<iostream>
using namespace std;
class bank{
    string name;
    int account;
    string type;
    int amount;
    public:
    void getData(string name,int account,string type,int amount){
        this->name=name;
        this->account=account;
        this->type=type;
     this->amount=amount;
    }
    void deposit(int n){
        amount=amount+n;
    }
    void withdraw(int n){
        amount=amount-n;
    }
    void print(){
        cout<<"the name of the bank account  holder is :"<<name<<endl<<"the account no is"<<account<<endl;
        cout<<"the type of the account is :"<<type<<endl<<"the amount in account is "<<amount<<endl;
    }
};
int main(){
    bank a;
    a.getData("sachin",8765,"saving",987);
    a.deposit(1000);
    a.withdraw(765);
    a.print();
    return 0;

}