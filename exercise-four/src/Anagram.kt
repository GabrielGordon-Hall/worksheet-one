class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val validSet = mutableSetOf<String>()
        val sortedWord = sortedCharacters(word)
        anagrams.filterTo(validSet) { !it.toLowerCase().contentEquals(word.toLowerCase())
                                        && sortedCharacters(it).contentEquals(sortedWord) }
        return validSet
    }

    private fun sortedCharacters(word: String): CharArray {
        val wordArray = word.toLowerCase().toCharArray()
        wordArray.sort()
        return wordArray
    }
}