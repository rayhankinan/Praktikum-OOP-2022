#include "BaseAsset.hpp"
#include "DepreciatingAsset.hpp"

double DepreciatingAsset::getValue(int years) {
    double value = 1;

    for (int i = 0; i < years; i++) {
        value = value * (1 - this->rate);
    }

    return this->x->getValue(years) * value;
}