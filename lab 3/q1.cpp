#include<iostream>
using namespace std;
class employee{
    string name;
    int wage;
    int bonus;
    public:
    void inputData(){
        cout<<"enter the name :";
        cin>>name;
        cout<<"enter the wage earned :";
        cin>>wage;
    }
    void comput(){
        if(wage>=2000){
            bonus=wage/10;
        }
        else{
            bonus=0;
        }
    }
    void print(){
        cout<<"the name of the employee is :"<<name<<endl<<"the wage earned by the employee is :"<<wage<<endl;
        cout<<"the bonus is :"<<bonus<<endl;
    }
};
int main(){
    employee a;
    a.inputData();
    a.comput();
    a.print();
    return 0;
}