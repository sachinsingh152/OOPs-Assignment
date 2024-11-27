#include<iostream>
using namespace std;
class student{
 string name;
 string gen;
 int scode;
 string sname;
 int inmark;
 int oumark;
 static int count;
 public:
 student(){
this->name="sachin";
this->gen="male";
this->scode=1;
this->sname="english";
this->inmark=100;
this->oumark=200;
count++;
 }
 student( string name,string gen,int scode,string sname, int inmark,int oumark){
this->name=name;
this->gen=gen;
this->scode=scode;
this->sname=sname;
this->inmark=inmark;
this->oumark=oumark;
count++;
 }
student(student &s){
    name=s.name;
    gen=s.gen;
    scode=s.scode;
    sname=s.sname;
    inmark=s.inmark;
    oumark=s.oumark;
    count++;
}
~student(){
    cout<<"default deconstuctor"<<endl;
}
friend  void print(student &s);

};
inline  void print(student &s){
    cout<<"student name"<<s.name<<"student gender:"<<s.gen<<endl<<"subject code"<<s.scode<<endl<<"subject name"<<s.sname<<endl<<"internal mark: "<<s.inmark<<endl<<"external mark"<<s.oumark<<endl;
}
int student:: count=0;
int main(){
    student a,b();
    print(a);

    return 0;
}