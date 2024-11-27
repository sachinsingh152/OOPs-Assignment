#include <iostream>
#include <string>
using namespace std;

class Employee {
public:
    string name;
    int ncall;
    double bamount;

    void inputData() {
        cout << "Enter the customer's name and number of calls made: ";
        cin >> name >> ncall;
    }

    void compu() {
        if (ncall <= 100)
            bamount = 200;
        else if (ncall <= 150)
            bamount = 200 + (ncall - 100) * 0.60;
        else if (ncall <= 200)
            bamount = 200 + 50 * 0.60 + (ncall - 150) * 0.50;
        else
            bamount = 200 + 50 * 0.60 + 50 * 0.50 + (ncall - 200) * 0.40;
    }

    void displayInfo() {
        cout << "Customer Name: " << name << ", Bill Amount: Rs " << bamount << endl;
    }
};

int main() {
    Employee cust;
    cust.inputData();
    cust.compu();
    cust.displayInfo();
    return 0;
}
