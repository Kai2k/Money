package com.mkodo.kentbeck

abstract class Money(val amount: Int) {
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }

        fun franc(amount: Int): Money {
            return Franc(amount)
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
