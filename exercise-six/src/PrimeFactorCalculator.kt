object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        val result = mutableListOf<Int>()
        var mutInt = int
        var factor = 2
        while (factor <= mutInt) {
            if (mutInt % factor == 0) {
                result.add(factor)
                mutInt /= factor
                factor--
            }
            factor++
        }
        return result
    }

    fun primeFactors(long: Long): List<Long> {
        val result = mutableListOf<Long>()
        var mutLong = long
        var factor = 2L
        while (factor <= mutLong) {
            if (mutLong % factor == 0L) {
                result.add(factor)
                mutLong /= factor
                factor--
            }
            factor++
        }
        return result
    }
}

