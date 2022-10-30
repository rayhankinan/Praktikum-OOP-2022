#include "AddExpression.hpp"

AddExpression::AddExpression(Expression *x, Expression *y) : BinaryExpression(x, y) {
    /* EMPTY */
}

int AddExpression::solve() {
    return this->x->solve() + this->y->solve();
}