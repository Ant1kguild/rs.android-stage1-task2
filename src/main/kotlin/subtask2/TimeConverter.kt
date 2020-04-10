package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        return when (val min = minute.toInt()) {
            0 -> "${getHour(hour)} o' clock"
            15 -> "quarter past ${getHour(hour)}"
            30 -> "half past ${getHour(hour)}"
            45 -> "quarter to ${getHour(hour, 1)}"
            1 -> "one minute past ${getHour(hour)}"
            in 1..14 -> "${getMinutes(min)} minutes past ${getHour(hour)}"
            in 16..30 -> "${getMinutes(min)} minutes past ${getHour(hour)}"
            in 31..44 -> "${getMinutes(60 - min)} minutes to ${getHour(hour, 1)}"
            in 46..60 -> "${getMinutes(60 - min)} minutes to ${getHour(hour, 1)}"
            else -> ""
        }
    }

    private fun getHour(hour: String, up : Int = 0) =
        when (val currentHour = (hour.toInt() + up).toString()) {
            "0" -> "zero"
            "1" -> "one"
            "2" -> "two"
            "3" -> "three"
            "4" -> "four"
            "5" -> "five"
            "6" -> "six"
            "7" -> "seven"
            "8" -> "eight"
            "9" -> "nine"
            "10" -> "ten"
            "11" -> "eleven"
            "12" -> "twelve"
            else -> ""
        }

    private fun getMinutes(minute: Int): String {
        val min = arrayOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "thirty"
        )
        return min[(minute - 1)]
    }
}
