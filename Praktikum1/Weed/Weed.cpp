#include "Weed.hpp"
using namespace std;

Weed::Weed() {
    this->many = 1;
}

Weed::Weed(int n) {
    this->many = n;
}

Weed::Weed(const Weed &b) {
    this->many = b.many;
}

Weed::~Weed() {
    /* EMPTY */
}

void Weed::step() {
    int i;

    for (i = 0; i < this->many; i++) {
        cout << "kresek...";
    }
    cout << endl;
}