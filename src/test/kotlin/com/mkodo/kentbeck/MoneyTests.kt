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
    fun testFrancMultiplication() {
        val five = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }

    @Test
    fun testEquality() {
        val five = Dollar(5)
        val anotherFive = Dollar(5)
        val six = Dollar(6)
        assertTrue(five == anotherFive)
        assertFalse(five == six)
        val one = Franc(1)
        val anotherOne = Franc(1)
        assertTrue(one == anotherOne)
        assertFalse(one == Franc(2))
        assertFalse(five.equals(Franc(5)))
    }
}