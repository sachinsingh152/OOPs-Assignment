#include<iostream>
using namespace std;
class Publication{
   string title;
   int price;
   string name;
public:
  void getData(){
    cout<<"enter the title,price and author name: "<<endl;
    cin>>title>>price>>name;
  }
  void Display(){
    cout<<"the name of the book is "<<title<<endl<<"the price is :"<<price<<endl<<"the name of the author is "<<name<<endl;
  }
};
class Book:public Publication{
   int pcount;
   public:
   void getdata(){
    cout<<"the page count of the book is :"<<endl;
    cin>>pcount;
   }
   void display(){
    cout<<"the page count of the book is "<<pcount<<endl;
   }
};
class Ebook:public Publication{
   int ptime;
   public:
   void getdata(){
    cout<<"the page playing of the book is :"<<endl;
    cin>>ptime;
   }
   void display(){
    cout<<"the page playing of the book is "<<ptime<<endl;
   }
};
int main(){
    Publication a;
    a.getData();
    a.Display();
    Book b;
    b.getData();
    b.Display();
    b.getdata();
    b.display();
    Ebook c;
   c.getData();
    c.Display();
    c.getdata();
    c.display();  
    return 0;
}