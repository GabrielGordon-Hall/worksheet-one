object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val counts = mutableMapOf<String, Int>()
        for (word in phrase.split(" ", "\n", ",")) {
            val cleanWord = clean(word.toLowerCase().trim())
            if (cleanWord != "") {
                val old = counts.getOrDefault(cleanWord, 0)
                counts.put(cleanWord, old + 1)
            }
        }
        return counts
    }

    private fun clean(word: String): String {
        val re = Regex("[^A-Za-z0-9' ]")
        val subbed = re.replace(word, "")
        if (subbed.startsWith("'") && subbed.endsWith("'")) {
            return subbed.substring(1, subbed.length - 1)
        }
        return subbed
    }
}
