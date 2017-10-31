package org.mweinberg.RomanNumerals

val romanList = listOf(Pair(1, "I"), Pair(4, "IV"), Pair(5, "V"), Pair(9, "IX"),
        Pair(10, "X"), Pair(40, "XL"), Pair(50, "L"), Pair(90, "XC"), Pair(100, "C"),
        Pair(400, "CD"), Pair(500, "D"), Pair(900, "CM"), Pair(1000, "M"))

fun toRomanNumeral(integer: Int): String {
    var constructedNumeral = ""
    var intInProcess = integer
    while (intInProcess > 0) {
        val biggestApplicable = romanList.findLast { it.first <= intInProcess } ?: Pair(1, "I")
        constructedNumeral += biggestApplicable.second
        intInProcess -= biggestApplicable.first
    }
    return constructedNumeral
}

fun toInteger(roman: String): Int {
    var integer = 0
    var romanInProcess = roman
    while (romanInProcess.isNotEmpty()) {
        val smallestApplicable = romanList.findLast { romanInProcess.startsWith(it.second) } ?: Pair(1, "I")
        integer += smallestApplicable.first
        romanInProcess = romanInProcess.removeRange(0, (smallestApplicable.second).length)
    }
    return integer
}
