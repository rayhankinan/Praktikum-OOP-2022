#include "Box.hpp"

int main() {
    Box* b2 = new Box(2);
    Box* b0 = new Box();
    Box* b1 = new Box(1);

    *b0 = *b2;

    Box* b1copy = new Box(*b1);

    b2->peek();
    b1->peek();

    delete b2;
    delete b1;
    delete b1copy;
    delete b0;
}