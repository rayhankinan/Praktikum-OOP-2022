#include "Animal.hpp"
#include "Dog.hpp"
#include "Chicken.hpp"

int main() {
    Dog d1(false);
    Chicken c1;
    
    Animal *a1 = new Chicken();
    Animal *a2 = new Animal(*a1);

    c1.~Chicken();

    c1.feed();
    c1.walk();
    a2->walk();
    d1.walk();
    c1.breed();

    delete a1;

    Animal *d2 = new Dog(true);
    d2->breed();

    delete d2;

    delete a2;

    return 0;
}