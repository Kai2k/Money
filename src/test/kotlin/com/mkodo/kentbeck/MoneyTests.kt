package com.mkodo.kentbeck

import org.junit.Assert.*
import org.junit.Test

class MoneyTests {

    @Test
    fun testMultiplication() {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testFrancMultiplication() {
        val five = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }

    @Test
    fun testEquality() {
        val five = Money.dollar(5)
        val anotherFive = Money.dollar(5)
        val six = Money.dollar(6)
        assertTrue(five == anotherFive)
        assertFalse(five == six)
        val one = Money.franc(1)
        val anotherOne = Money.franc(1)
        assertTrue(one == anotherOne)
        assertFalse(one == Money.franc(2))
        assertFalse(five == Money.franc(5))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency)
        assertEquals("CHF", Money.franc(1).currency)
    }

    @Test
    fun testDifferentClassEquality() {
        assertTrue(Money(10, "CHF") == Franc(10, "CHF"))
    }
}