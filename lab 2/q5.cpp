#include <iostream>
#include <vector>
#include <string>
using namespace std;

class StringArray {
    vector<string> A;

public:
    StringArray() {}

    StringArray(int n) {
        string line;
        for (int i = 0; i < n; ++i) {
            getline(cin, line);
            A.push_back(line);
        }
    }

    StringArray(const StringArray& other) {
        A = other.A;
    }

    ~StringArray() {
        cout << "StringArray object is being destroyed." << endl;
    }

    void replaceString(const string& S1, const string& S2) {
        for (auto& line : A) {
            size_t pos;
            while ((pos = line.find(S1)) != string::npos) {
                line.replace(pos, S1.length(), S2);
            }
        }

        for (const auto& line : A) {
            cout << line << endl;
        }
    }
};

int main() {
    int n;
    cout << "Enter the number of lines: ";
    cin >> n;
    cin.ignore();
    StringArray arr(n);

    string S1, S2;
    cout << "Enter the string to replace: ";
    getline(cin, S1);
    cout << "Enter the replacement string: ";
    getline(cin, S2);

    arr.replaceString(S1, S2);
    return 0;
}
