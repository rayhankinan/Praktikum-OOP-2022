#ifndef __BANK_HPP__
#define __BANK_HPP__

#include <iostream>
#include "Account.hpp"

class TransactionFailedException : public BaseException {
private:
    BaseException *exc;

public:
    TransactionFailedException(BaseException *exc) {
        this->exc = exc;
    }

    void printMessage() {
        cout << "Transaksi gagal dengan pesan kesalahan:" << endl;
        exc->printMessage();
    }
};

class AccountNotFoundException : public BaseException {
private:
    string number;

public:
    AccountNotFoundException(string number) {
        this->number = number;
    }

    void printMessage() {
        cout << "Tidak ditemukan rekening dengan nomor " << this->number << endl;
    }
};

class Bank {
private:
    Account* accounts;
    static const int maxEl = 100;

public:
    Bank() {
        this->accounts = new Account[Bank::maxEl];
    }

    ~Bank() {
        delete[] this->accounts;
    }

    Account& getAccount(int idx) {
        return this->accounts[idx];
    }

    int findAccountIdx(string number) {
        // Mengembalikan indeks rekening yang memiliki nomor number
        int idx = -1;
        for (int i = 0; i < Bank::maxEl; i++) {
            if (this->accounts[i].getNumber() == number) {
                idx = i;
            }
        }

        if (idx == -1) {
            AccountNotFoundException *e = new AccountNotFoundException(number);
            throw e;
        } else {
            return idx;
        }
    }

    void transfer(string fromNumber, string toNumber, int amount) {
        // Mengirimkan uang sebanyak amount dari account dengan nomor
        // fromNumber ke account dengan nomor toNumber

        try {
            Account& fromAccount = this->accounts[this->findAccountIdx(fromNumber)];
            Account& toAccount = this->accounts[this->findAccountIdx(toNumber)];
            fromAccount.withdraw(amount);
            toAccount.add(amount);

        } catch (BaseException *e) {
            TransactionFailedException *eNew = new TransactionFailedException(e);
            throw eNew;
        }
    }
};

#endif