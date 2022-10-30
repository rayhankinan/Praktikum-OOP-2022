#include "Wallet.hpp"

int main() {
    Wallet *wallet_0 = new Wallet();
    Wallet *wallet_1 = new Wallet(1, 10000);
    wallet_1->checkBalance();
    Wallet *wallet_2 = new Wallet(2, 8000);
    *wallet_2 = *wallet_1;
    wallet_1->addBalance(5000);
    wallet_0->addBalance(3000);
    wallet_0->checkBalance();
    wallet_2->checkBalance();
    wallet_1->checkBalance();
    delete wallet_1;
    delete wallet_0;
    delete wallet_2;
}