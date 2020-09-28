package com.mkodo.kentbeck

class Sum(val augend: Expression, val addend: Expression): Expression {
    override fun reduce(bank: Bank, to: String): Money {
        return Money(augend.reduce(bank, to).amount +
                addend.reduce(bank, to).amount, to)
    }

    override fun plus(addend: Expression): Expression {
        TODO("Not yet implemented")
    }
}
