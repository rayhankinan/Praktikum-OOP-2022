#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"
#include <iostream>
using namespace std;

int main() {
    Car *car4 = new Car(4);
    Car *car10 = new Car(10);
    Bike *bike = new Bike();

    Vehicle *vehicle = new Vehicle(*bike);

    delete bike;

    car10->Vehicle::drive();
    vehicle->clean();
    car4->drive();
    vehicle->park();

    delete car10;
    delete vehicle;
    delete car4;
}