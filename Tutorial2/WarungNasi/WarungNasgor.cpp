#include "WarungNasgor.hpp"
#include <iostream>
using namespace std;

WarungNasgor::WarungNasgor(int uang, int nasi, int telur, int kecap) : WarungNasi(uang, telur, nasi) {
    this->kecap = kecap;
}

bool WarungNasgor::masak(int pesanan) {
    if (this->getNasi() < pesanan || this->getTelur() < pesanan || this->kecap < pesanan) {
        return false;
    } else {
        this->setNasi(this->getNasi() - pesanan);
        this->setTelur(this->getTelur() - pesanan);
        this->kecap -= pesanan;
        
        int pendapatan = pesanan * 15000;
        this->setUang(this->getUang() + pendapatan);
        return true;
    }
}