package test

import org.junit.Test
import org.mweinberg.RomanNumerals.*
import kotlin.test.assertEquals


class TestSource() {
    @Test fun megaTest() {
        assertEquals(1.toRomanNumeral(), "I")
        assertEquals(14.toRomanNumeral(), "XIV")
        assertEquals(321.toRomanNumeral(), "CCCXXI")
        assertEquals(3999.toRomanNumeral(), "MMMCMXCIX")
        assertEquals(1490.toRomanNumeral(), "MCDXC")
        assertEquals(40.toRomanNumeral(), "XL")
        assertEquals(95.toRomanNumeral(), "XCV")
        assertEquals("I".romanToInteger(), 1)
        assertEquals("XIV".romanToInteger(), 14)
        assertEquals("CCCXXI".romanToInteger(), 321)
        assertEquals("MMMCMXCIX".romanToInteger(), 3999)
        assertEquals("MCDXC".romanToInteger(), 1490)
        assertEquals("XL".romanToInteger(), 40)
        assertEquals("XCV".romanToInteger(), 95)
    }
}