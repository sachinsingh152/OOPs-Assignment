#include<iostream>
using namespace std;
class tax{
  string name;
  int income;
  int taxd;
  public:
  void inputData(){
     cout<<"enter the name :";
        cin>>name;
        cout<<"enter the income :";
        cin>>income;
  }
  void comput(){
    if(income<=100000){
        taxd=0;
    }
    else if(income<=150000&&income>100000){
        taxd=(income-100000)*0.1;
    }
    else if(income<=200000&&income>150000){
        taxd=5000+(income-150000)*0.2;
    }
    else{
        taxd=15000+(income-200000)*0.3;
    }
  }
  void print(){
   cout<<" the name  is :"<<name<<endl<<"the income is :"<<income<<endl;
        cout<<"the taxdue is :"<<taxd<<endl;
  }
};
int main(){
    tax a;
    a.inputData();
    a.comput();
    a.print();
    return 0;
}