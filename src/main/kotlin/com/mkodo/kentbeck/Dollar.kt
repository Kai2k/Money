package com.mkodo.kentbeck

class Dollar(private val amount: Int) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return amount == (other as Dollar).amount
    }

    override fun hashCode(): Int {
        return amount
    }
}