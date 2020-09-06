package com.mkodo.kentbeck

class Bank {
    fun reduce(source: Expression, to: String): Money {
        return source.reduce(to)
    }
}
