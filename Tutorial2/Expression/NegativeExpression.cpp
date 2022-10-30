#include "NegativeExpression.hpp"

NegativeExpression::NegativeExpression(Expression *x) : UnaryExpression(x) {
    /* EMPTY */
}

int NegativeExpression::solve() {
    return -1 * this->x->solve();
}