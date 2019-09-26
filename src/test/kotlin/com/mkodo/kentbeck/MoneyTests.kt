package com.mkodo.kentbeck

import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyTests {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}