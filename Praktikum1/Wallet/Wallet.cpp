#include "Wallet.hpp"
#include <iostream>
using namespace std;

Wallet::Wallet() {
  id = 0;
  amount = 0;
  cout << "new empty wallet with default id " << id << " and default amount " << amount << endl;
}

Wallet::Wallet(int id, int amount) {
  this->id = id;
  this->amount = amount;
  cout << "new empty wallet with id " << id << " and amount " << amount << endl;
}

Wallet::Wallet(const Wallet& wallet) {
  this->id = wallet.id;
  this->amount = wallet.amount;
  cout << "copy wallet " << wallet.id << endl;
}

Wallet& Wallet::operator=(const Wallet& wallet) {
  cout << "assign wallet " << this->id << " <- " << wallet.id << endl;
  this->id = wallet.id;
  this->amount = wallet.amount;
  return *this;
}

Wallet::~Wallet() {
  cout << "destroy wallet " << id << " with remaining balance " << amount << endl;
}

void Wallet::checkBalance() {
  cout << "wallet " << id << " has a balance of " << amount << endl;
}

void Wallet::addBalance(int amountAdded) {
  this->amount += amountAdded;
  cout << "wallet " << id << " increased balance by " << amountAdded << ". New balance: " << amount << endl;
}