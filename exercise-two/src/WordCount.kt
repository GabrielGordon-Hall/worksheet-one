object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase.split(' ')
                .map { noPunc(it.toLowerCase().trim()) }
                .groupingBy { it }
                .eachCount()
                .toMutableMap()
    }

    private fun noPunc(word: String): String {
        val punc = setOf("?", "!", "'", '"', ".", ",")

        if (word[0] in punc) {
            word.substring(1)
        }
//        else if (word[word.length] in punc) {
//            word.substring(0, word.length - 1)
//        }
//
        return word
    }

}
