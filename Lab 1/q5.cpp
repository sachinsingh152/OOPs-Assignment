#include <iostream>
using namespace std;

struct Arithmetic {
    int no1;
    int no2;
};

void add(Arithmetic a) {
    cout << "Addition: " << a.no1 + a.no2 << endl;
}

void sub(Arithmetic a) {
    cout << "Subtraction: " << a.no1 - a.no2 << endl;
}

void mul(Arithmetic a) {
    cout << "Multiplication: " << a.no1 * a.no2 << endl;
}

void div(Arithmetic a) {
    if (a.no2 != 0)
        cout << "Division: " << (double)a.no1 /(double) a.no2 << endl;
    else
        cout << "Division by zero is not allowed." << endl;
}

int main() {
    Arithmetic a;
    cout << "Enter two numbers: ";
    cin >> a.no1 >> a.no2;

    add(a);
    sub(a);
    mul(a);
    div(a);

    return 0;
}
