#include <iostream>
using namespace std;

struct Complex {
    int real;
    int imag;
};

Complex add(Complex a, Complex b) {
    return {a.real + b.real, a.imag + b.imag};
}

Complex sub(Complex a, Complex b) {
    return {a.real - b.real, a.imag - b.imag};
}

Complex mul(Complex a, Complex b) {
    return {a.real * b.real - a.imag * b.imag, a.real * b.imag + a.imag * b.real};
}

Complex div(Complex a, Complex b) {
    int denominator = b.real * b.real + b.imag * b.imag;
    return {(a.real * b.real + a.imag * b.imag) / denominator, (a.imag * b.real - a.real * b.imag) / denominator};
}

void display(Complex result) {
    cout << "Result: " << result.real << " + " << result.imag << "i" << endl;
}

int main() {
    Complex a, b, result;
    int choice;

    cout << "Enter the real and imaginary parts of the first complex number: ";
    cin >> a.real >> a.imag;
    cout << "Enter the real and imaginary parts of the second complex number: ";
    cin >> b.real >> b.imag;

    cout << "Choose operation:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n";
    cin >> choice;

    switch (choice) {
        case 1: result = add(a, b); break;
        case 2: result = sub(a, b); break;
        case 3: result = mul(a, b); break;
        case 4: result = div(a, b); break;
        default: cout << "Invalid choice"; return 1;
    }

    display(result);
    return 0;
}
