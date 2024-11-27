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

    void findAndCount(const string& S) {
        int count = 0;
        for (const auto& line : A) {
            if (line == S) {
                ++count;
            }
        }
        if (count > 0) {
            cout << "The string \"" << S << "\" appears " << count << " times." << endl;
        } else {
            cout << "The string \"" << S << "\" is not in the array." << endl;
        }
    }
};

int main() {
    int n;
    cout << "Enter the number of lines: ";
    cin >> n;
    cin.ignore();
    StringArray arr(n);

    string S;
    cout << "Enter the string to search: ";
    getline(cin, S);

    arr.findAndCount(S);
    return 0;
}
