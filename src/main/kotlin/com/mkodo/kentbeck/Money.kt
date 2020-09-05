package com.mkodo.kentbeck

open class Money(val amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount &&
                other.javaClass == javaClass
    }

    override fun hashCode(): Int {
        return amount
    }
}
