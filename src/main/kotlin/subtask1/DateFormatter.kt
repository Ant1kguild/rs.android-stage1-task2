package subtask1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val currentMonth  = if (month.length == 1) "0$month" else month
            getDay(LocalDate.parse("$year-$currentMonth-$day"))
        } catch (e: Exception) {
            "Такого дня не существует"
        }


    }

    private fun getMonth(month: Month): String {
        return when (month) {
            Month.JANUARY -> "января"
            Month.FEBRUARY -> "февраля"
            Month.MARCH -> "марта"
            Month.APRIL -> "апреля"
            Month.MAY -> "мая"
            Month.JUNE -> "июня"
            Month.JULY -> "июля"
            Month.AUGUST -> "августа"
            Month.SEPTEMBER -> "сентября"
            Month.OCTOBER -> "октября"
            Month.NOVEMBER -> "ноября"
            Month.DECEMBER -> "декабря"
        }
    }

    private fun getDay(date: LocalDate): String {
        return when (date.dayOfWeek) {
            DayOfWeek.MONDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, понедельник"
            DayOfWeek.TUESDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, вторник"
            DayOfWeek.WEDNESDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, среда"
            DayOfWeek.THURSDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, четверг"
            DayOfWeek.FRIDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, пятница"
            DayOfWeek.SATURDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, понедельник"
            DayOfWeek.SUNDAY -> "${date.dayOfMonth} ${getMonth(date.month)}, воскресенье"
            else -> "Такого дня не существует"
        }
    }
}
