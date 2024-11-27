#include<iostream>
using namespace std;
class book{
 int anum;
 string name;
 string title;
 int year;
 string pname;
 int cost;
 public:
 static int count;
 book(){
this->anum=1001;
this->name="sachin";
this->title="discovery of india";
this->year=1999;
this->pname="a limited";
this->cost=599;
count++;
 }
 book( int anum,string name, string title, int year, string pname,int cost){
this->anum=anum;
this->name=name;
this->title=title;
this->year=year;
this->pname=pname;
this->cost=cost;
count++;
 }
 book(book &s){
    anum=s.anum;
    name=s.name;
    title=s.title;
    year=s.year;
    pname=s.pname;
    cost=s.cost;
    count++;
 }
 ~book(){
    cout<<"default deconstructor"<<endl;
 }
 friend void print(book &s);

};
 inline void print(book &s){
  cout<<"book acc num"<<s.anum<<endl<<"name of author"<<s.name<<endl<<"title "<<s.title<<endl<<"year :"<<s.year<<endl<<"publisher name"<<s.pname<<endl<<"cost "<<s.cost<<endl;
 }
 int book:: count=0;

int main(){
    book a;
    print(a);
    book b(1002,"diwyanshu","india discovery",1997,"limited a",1000);
    print(b);
    return 0;
}