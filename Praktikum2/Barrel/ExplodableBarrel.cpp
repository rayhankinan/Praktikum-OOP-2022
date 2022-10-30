#include "ExplodableBarrel.hpp"

ExplodableBarrel::ExplodableBarrel() : Damageable(1), Explodable() {
    this->radius = 5;
}

ExplodableBarrel::ExplodableBarrel(int radius, int baseDamage) : Damageable(1), Explodable(baseDamage) {
    this->radius = radius;
}

void ExplodableBarrel::takeDamage(int damage, string element) {
    if (!this->isDestroyed()) {
        this->Damageable::takeDamage(damage);
        if (this->isDestroyed()) {
            this->ExplodableBarrel::explode(radius);
        }
    }
}