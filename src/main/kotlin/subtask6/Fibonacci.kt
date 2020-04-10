package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        val list = mutableListOf(0, 1)
        while (list[0] * list[1] < n) {
            val temp = list[1]
            list[1] = list[0] + list[1]
            list[0] = temp
        }
        if (list[0] * list[1] > n) list.add(0) else list.add(1)
        return list.toIntArray()
    }
}
