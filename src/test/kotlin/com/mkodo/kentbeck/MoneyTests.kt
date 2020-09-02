package com.mkodo.kentbeck

import org.junit.Assert.*
import org.junit.Test

class MoneyTests {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality() {
        val five = Dollar(5)
        val anotherFive = Dollar(5)
        val six = Dollar(6)
        assertTrue(five == anotherFive)
        assertFalse(five == six)
    }
}