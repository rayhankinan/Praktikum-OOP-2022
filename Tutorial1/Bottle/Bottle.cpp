#include "Bottle.hpp"

int Bottle::numOfBottle = 0;

Bottle::Bottle(): id(Bottle::numOfBottle + 1) {
    this->height = 10.00;
    this->radius = 10.00;
    this->waterHeight = 0;
    Bottle::numOfBottle++;
}

Bottle::Bottle(float height, float radius): id(Bottle::numOfBottle + 1) {
    this->height = height;
    this->radius = radius;
    this->waterHeight = 0;
    Bottle::numOfBottle++;
}

Bottle::Bottle(const Bottle& bottle): id(bottle.id) {
    this->height = bottle.height;
    this->radius = bottle.radius;
    this->waterHeight = bottle.waterHeight;
}

Bottle::~Bottle() {

}

int Bottle::getId() const {
    return this->id;
}

float Bottle::getWaterVolume() const {
    return PI * this->radius * this->radius * this->waterHeight;
}

float Bottle::getBottleVolume() const {
    return PI * this->radius * this->radius * this->height;
}

void Bottle::setHeight(float height) {
    this->height = height;

    if (height < this->waterHeight) {
        this->waterHeight = height;
    }
}

void Bottle::addWater(float waterVolume) {
    if (this->waterHeight + this->getWaterHeightIfVolume(waterVolume) > this->height) {
        this->waterHeight = this->height;
    } else {
        this->waterHeight = this->waterHeight + this->getWaterHeightIfVolume(waterVolume);
    }
}

void Bottle::substractWater(float waterVolume) {
    if (this->waterHeight - this->getWaterHeightIfVolume(waterVolume) < 0) {
        this->waterHeight = 0;
    } else {
        this->waterHeight = this->waterHeight - this->getWaterHeightIfVolume(waterVolume);
    }
}

float Bottle::getWaterHeightIfVolume(float waterVolume) const {
    return waterVolume / (PI * this->radius * this->radius);
}

void Bottle::pourWaterTo(Bottle& other) {
    if (other.getBottleVolume() - other.getWaterVolume() > this->getWaterVolume()) {
	    float tmp = this->getWaterVolume();
        this->substractWater(tmp);
        other.addWater(tmp);
    } else {
        this->substractWater(other.getBottleVolume() - other.getWaterVolume());
        other.addWater(other.getBottleVolume() - other.getWaterVolume());
    }
}