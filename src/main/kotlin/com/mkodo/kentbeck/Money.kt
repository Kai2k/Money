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

    override fun times(multiplier: Int): Expression {
        return Money(amount * multiplier, currency)
    }

    override fun plus(addend: Expression): Expression {
        return Sum(Money(amount, currency), addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }
}

interface Expression{
    fun reduce(bank: Bank, to: String): Money
    fun plus(addend: Expression): Expression
    fun times(multiplier: Int): Expression
}
