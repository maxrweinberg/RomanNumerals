package test

import org.junit.Test
import org.mweinberg.RomanNumerals.*
import kotlin.test.assertEquals


class TestSource() {
    @Test fun megaTest() {
        assertEquals(toRomanNumeral(1), "I")
        assertEquals(toRomanNumeral(14), "XIV")
        assertEquals(toRomanNumeral(321), "CCCXXI")
        assertEquals(toRomanNumeral(3999), "MMMCMXCIX")
        assertEquals(toRomanNumeral(1490), "MCDXC")
        assertEquals(toRomanNumeral(40), "XL")
        assertEquals(toRomanNumeral(95), "XCV")
        assertEquals(toInteger("I"), 1)
        assertEquals(toInteger("XIV"), 14)
        assertEquals(toInteger("CCCXXI"), 321)
        assertEquals(toInteger("MMMCMXCIX"), 3999)
        assertEquals(toInteger("MCDXC"), 1490)
        assertEquals(toInteger("XL"), 40)
        assertEquals(toInteger("XCV"), 95)
    }
}