#include "Expression.hpp"
#include "AddExpression.hpp"
#include "SubstractExpression.hpp"
#include "NegativeExpression.hpp"
#include <iostream>
using namespace std;

int main() {
    AddExpression *e1 = new AddExpression(
        new TerminalExpression(4),
        new TerminalExpression(6)
    );
    cout << e1->solve() << endl;

    SubstractExpression *e2 = new SubstractExpression(
        new TerminalExpression(4),
        new TerminalExpression(6)
    );
    cout << e2->solve() << endl;

    NegativeExpression *e3 = new NegativeExpression(
        new TerminalExpression(1)
    );
    cout << e3->solve() << endl;
}