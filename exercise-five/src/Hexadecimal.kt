object Hexadecimal {

    fun toDecimal(s: String): Int {
        val hexMap = hashMapOf('a' to 10, 'b' to 11, 'c' to 12, 'd' to 13, 'e' to 14, 'f' to 15)
        var result = 0.0
        var index = 0.0
        for (char in s.toLowerCase().toCharArray().reversed()) {
            val dec = (if (char.isDigit()) char.toString().toInt() else hexMap[char]) ?: return 0
            result += dec.toDouble() * (Math.pow(16.0, index))
            index++
        }
        return result.toInt()
    }
}
