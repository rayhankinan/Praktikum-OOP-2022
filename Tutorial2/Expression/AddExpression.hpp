#include "Expression.hpp"

class AddExpression : public BinaryExpression {
    public:
        AddExpression(Expression *x, Expression *y);
        int solve();
};