package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val isPangram = checkPangram(inputString)
        return inputString
            .split(" ")
            .filter { it.isNotEmpty() && it[0] != '\n' }
            .sortedBy { number(it, isPangram) }
            .joinToString(" ") { createString(it, isPangram) }
    }


    private fun checkPangram(inputString: String): Boolean {
        val alphabet = mutableSetOf<Char>()
        inputString.forEachIndexed { index, letter ->
            if (inputString[index].isLetter()) alphabet.add(letter.toLowerCase())
        }
        return alphabet.size == 26
    }

    private fun number(s: String, isPangram: Boolean): Int {
        var counter = 0
        val vol =
            arrayOf('A', 'E', 'I', 'O', 'U', "Y", 'a', 'e', 'i', 'o', 'u', 'y')
        for (i in s.indices) {
            if (isPangram) {
                if (vol.contains(s[i])) counter++
            } else {
                if (s[i].isLetter() && !vol.contains(s[i])) counter++
            }
        }
        return counter
    }

    private fun createString(inputString: String, isPangram: Boolean): String {
        val vol =
            arrayOf('A', 'E', 'I', 'O', 'U', "Y", 'a', 'e', 'i', 'o', 'u', 'y')
        val temp = StringBuilder()
        var counter = 0
        if (isPangram) {
            inputString.forEach { letter ->
                if (vol.contains(letter)) {
                    counter++
                    temp.append(letter.toUpperCase())
                } else temp.append(letter)
            }
        } else {
            inputString.forEach { letter ->
                if (letter.isLetter() && !vol.contains(letter)) {
                    counter++
                    temp.append(letter.toUpperCase())
                } else temp.append(letter)
            }
        }
        temp.insert(0, counter.toString())
        return temp.toString()
    }


}
