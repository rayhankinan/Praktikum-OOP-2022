#include "WarungSaltedEgg.hpp"
#include <iostream>
using namespace std;

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam) : WarungNasi(uang, telur, nasi) {
    this->telurAsin = telurAsin;
    this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan) {
    if (this->getNasi() < pesanan || this->getTelur() < pesanan || this->telurAsin < 3 * pesanan || this->ayam < pesanan) {
        return false;
    } else {
        this->setNasi(this->getNasi() - pesanan);
        this->setTelur(this->getTelur() - pesanan);
        this->telurAsin -= 3 * pesanan;
        this->ayam -= pesanan;
        
        int pendapatan = pesanan * 30000;
        this->setUang(this->getUang() + pendapatan);
        return true;
    }
}