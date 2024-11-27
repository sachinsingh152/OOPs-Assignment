#include <iostream>
using namespace std;

struct It {
    int mi, to, fa;
    double tcost;
};

int main() {
    It order;
    const double mprice = 1500, tprice = 200, fprice = 450;
    const double mdis = 0.05, tdis = 0.10, fdis = 0.15;
    const double trate = 0.10;

    cout << "Enter the number of miners, toasters, and fans ordered: ";
    cin >> order.mi >> order.to >> order.fa;

    double mcost = order.mi * mprice * (1 - mdis);
    double tcost = order.to * tprice * (1 - tdis);
    double fcost = order.fa * fprice * (1 - fdis);
    order.tcost = mcost + tcost + fcost;
    order.tcost += order.tcost * trate;

    cout << "The total amount to be paid by the store is:  " << order.tcost << endl;
    return 0;
}
