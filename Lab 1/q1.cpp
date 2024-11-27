#include <iostream>
using namespace std;

struct Po {
    double w;
    double c;
};

int main() {
    Po p;
    cout << "Enter the weight of the letter in grams: ";
    cin >> p.w;

    if (p.w <= 50) {
        p.c = (p.w / 10) * 0.50;
    } else if (p.w <= 150) {
        p.c = 2.5 + ((p.w - 50) / 10) * 0.40;
    } else if (p.w <= 400) {
        p.c = 6.5 + ((p.w - 150) / 10) * 0.25;
    } else {
        p.c = 12.75 + ((p.w - 400) / 1000) * 25;
    }

    cout << "The postage to be paid is: Rs " << p.c << endl;
    return 0;
}
