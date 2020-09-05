package com.mkodo.kentbeck

abstract class Money(val amount: Int, val currency: String) {
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount &&
                other.javaClass == javaClass
    }

    override fun hashCode(): Int {
        return amount
    }

    abstract fun times(multiplier: Int): Money
}
