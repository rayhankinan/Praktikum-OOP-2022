#ifndef __WALLET_HPP__
#define __WALLET_HPP__

class Wallet {
  private:
    int id;
    int amount;

  public:
    Wallet();
    Wallet(int, int);
    Wallet(const Wallet&);
    Wallet& operator=(const Wallet&);
    ~Wallet();

    void checkBalance();
    void addBalance(int);
};

#endif