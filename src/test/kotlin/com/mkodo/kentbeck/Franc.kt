package com.mkodo.kentbeck

class Franc(val amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return amount == (other as Franc).amount
    }

    override fun hashCode(): Int {
        return amount
    }
}
