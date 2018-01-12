object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val resultList = arrayListOf<R>()
        for (item in collection) { resultList.add(function(item)) }
        return resultList
    }
}