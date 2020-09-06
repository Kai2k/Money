package com.mkodo.kentbeck

class Sum(val augend: Money, val addend: Money): Expression {
    override fun reduce(to: String): Money {
        return Money(augend.amount + addend.amount, to)
    }
}
