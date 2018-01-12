import java.lang.IllegalArgumentException

object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows < 0) throw IllegalArgumentException("Rows can't be negative!")
        val outer = mutableListOf<List<Int>>()
        for (row in 0 until rows) {
            var num = 1
            val inner = mutableListOf<Int>()
            for (subRow in 0..row) {
                inner.add(num)
                num = num * (row - subRow) / (subRow + 1)
            }
            outer.add(inner)
        }
        return outer
    }
}