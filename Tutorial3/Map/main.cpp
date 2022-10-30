#include <iostream>
#include <string>
#include <map>
using namespace std;

int main() {
    map<string, int> data;
    map<string, int>::iterator itr;
    string input, output;
    int N, M, X;

    cin >> N;
    while (N > 0) {
        cin >> input;

        data[input] = data.find(input) != data.end() ? data[input] + 1 : 1;

        N--;
    }

    cin >> M;
    while (M > 0) {
        cin >> input;

        if (data.find(input) != data.end()) {
            data[input] = max(data[input] - 1, 0);
        }

        M--;
    }

    for (itr = data.begin(); itr != data.end(); itr++) {
        output = itr->first;
        X = itr->second;

        while (X > 0) {
            cout << output << endl;
            X--;
        }
    }

    return 0;
}