#include <iostream>
#include <string>
using namespace std;

struct Publication
{
    string title;
    string author;
    double price;
};

struct Book : Publication
{
    int pcount;

    void getData()
    {
        cout << "Enter book title, author, price, and page count: ";
        cin >> title >> author >> price >> pcount;
    }

    void displayData()
    {
        cout << "Book Title: " << title << ", Author: " << author
             << ", Price: " << price << ", Pages: " << pcount << endl;
    }
};

struct Ebook : Publication
{
    double ptime;

    void getData()
    {
        cout << "Enter ebook title, author, price, and playing time: ";
        cin >> title >> author >> price >> ptime;
    }

    void displayData()
    {
        cout << "Ebook Title: " << title << ", Author: " << author
             << ", Price: " << price << ", Playing Time: " << ptime << " hours" << endl;
    }
};

int main()
{
    Book book;
    Ebook ebook;
    book.getData();
    ebook.getData();
    book.displayData();
    ebook.displayData();
    return 0;
}
