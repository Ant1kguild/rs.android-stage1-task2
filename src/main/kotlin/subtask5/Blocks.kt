package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> {
                blockA.toMutableList()
                    .filterIsInstance<Int>()
                    .sum()
            }
            String::class -> {
                blockA.toMutableList()
                    .filterIsInstance<String>()
                    .joinToString("")
            }
            LocalDate::class -> {
                blockA.toMutableList()
                    .filterIsInstance<LocalDate>()
                    .stream()
                    .map { it as LocalDate }
                    .max(LocalDate::compareTo).get()
                    .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> ""
        }
    }
}
