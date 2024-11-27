#include<iostream>
using namespace std;
class employee{
public:
   int emp_id;
   string emp_name;
   int age;
   employee(){
    this->age=0;
    this->emp_id=0;
    this->emp_name='\0';
   }
   employee(int emp_id,string emp_name,int age){
    this->emp_id=emp_id;
    this->age=age;
    this->emp_name=emp_name;
   }
};
int main(){
    int key;
    employee a[10];
    for(int i=0;i<10;i++){
        cout<<"enter the id of the "<<i+1<<" employee :";
        cin>>a[i].emp_id;
        cout<<"enter the name of the "<<i+1<<" employee :";
        cin>>a[i].emp_name;      
      cout<<"enter the age of the "<<i+1<<" employee :";
        cin>>a[i].age;
    }
    cout<<"\n enter the id you want to search :";
    cin>>key;
    for(int i=0;i<10;i++){
        if(key==a[i].emp_id){
             cout<<"the name of the employee is :"<<a[i].emp_name<<endl;
             break;
        } 
    }
    return 0;
}