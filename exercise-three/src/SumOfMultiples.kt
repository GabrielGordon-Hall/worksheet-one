object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        var sum = 0
        for (num in 1 until limit) {
            for (factor in factors) {
                if (num % factor == 0) {
                    sum += num
                    break
                }
            }
        }
        return sum
    }
}