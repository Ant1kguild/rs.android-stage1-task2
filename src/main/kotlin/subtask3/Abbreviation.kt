package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var result = "YES"
        var start = 0
        b.forEach {
            start = a.indexOf(it, start, true).also {
                index -> if (index == -1) result = "NO" }
        }
        return result
    }
}
