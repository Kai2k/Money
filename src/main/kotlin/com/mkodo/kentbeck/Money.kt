package com.mkodo.kentbeck

open class Money(val amount: Int, val currency: String): Expression {
    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    override fun toString(): String {
        return "$currency : $amount"
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount &&
                currency == other.currency
    }

    override fun hashCode(): Int {
        return amount
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun plus(addend: Money): Expression {
        return Sum(Money(amount, currency), addend)
    }

    override fun reduce(to: String): Money {
        return this
    }
}

interface Expression{
    fun reduce(to: String): Money
}
