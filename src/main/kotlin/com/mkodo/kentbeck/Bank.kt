package com.mkodo.kentbeck

class Bank {
    private var rates = mutableMapOf<Pair<String, String>, Int>()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        return rates[Pair(from, to)] ?: 1
    }
}
