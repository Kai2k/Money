package com.mkodo.kentbeck

import org.junit.Assert.*
import org.junit.Test

class MoneyTests {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
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