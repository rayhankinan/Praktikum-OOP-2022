#include "Zombie.hpp"
#include <iostream>
using namespace std;

Zombie::Zombie(int _stamina) : Undead(_stamina) {
    /* EMPTY */
}

void Zombie::attack(Player &player) {
    if (this->stamina > 0) {
        this->stamina--;
        if (player.getHealth() == 0) {
            cout << "nom nom nom" << endl;
        } else {
            player.setHealth(max(player.getHealth() - 3, 0));
        }
    } else {
        cout << "oof" << endl;
    }
}