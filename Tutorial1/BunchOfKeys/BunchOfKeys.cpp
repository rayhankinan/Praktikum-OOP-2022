#include "BunchOfKeys.hpp"

BunchOfKeys::BunchOfKeys() {
    this->n_keys = 0;
}

void BunchOfKeys::add() {
    this->n_keys++;
}

void BunchOfKeys::shake() {
    /* KAMUS */
    int i;

    /* ALGORITMA */
    if (this->n_keys > 1) {
        for (i = 0; i < this->n_keys; i++) {
            cout << "krincing" << endl;
        }
    } else {
        cout << "Tidak terjadi apa-apa" << endl;
    }
}