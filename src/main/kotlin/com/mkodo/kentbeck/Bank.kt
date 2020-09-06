package com.mkodo.kentbeck

class Bank {
    private var rates: MutableMap<Pair<String, String>, Int> = mutableMapOf()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        return rates.get(Pair(from, to)) ?: 1
    }
}
