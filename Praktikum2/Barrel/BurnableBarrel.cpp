#include "BurnableBarrel.hpp"

BurnableBarrel::BurnableBarrel() : Damageable() {
    
}

BurnableBarrel::BurnableBarrel(int health) : Damageable(health) {

}

void BurnableBarrel::takeDamage(int damage, string element) {
    if (!this->isDestroyed()) {
        if (element == "fire") {
            this->burn();
        }
        if (element == "water") {
            this->watered();
        }

        if (this->isBurned()) {
            this->Damageable::takeDamage(damage * this->multiplier);
        } else {
            this->Damageable::takeDamage(damage);
        }
    }
}